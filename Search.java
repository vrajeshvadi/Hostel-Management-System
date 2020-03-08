package student;

import java.util.*;
import java.io.*;
import info.*;
import exception.*;

public class Search{
	public Search()
	{
		login();
	}
	Scanner sc = new Scanner(System.in);
	void login(){
		System.out.println("\n\t\t======================================");
		System.out.println("\n\t\t\t..::Search::..");
		System.out.println("\n\t\t======================================");
		System.out.print("Enter Your Full Name:");
		String fullname = sc.nextLine();

		String s = "Student Information/"+fullname+".txt";
		try{
			File obj = new File(s);
			if(obj.exists()){
				Scanner read = new Scanner(obj);
				String str;
				
				System.out.println("\n\n");
				do{
					str=read.nextLine();
				System.out.println(str);
				}while(str!=null);
			}
			else{
				throw new NotFound("Student not Found!!!!");
			}
		}
		catch(IOException e){
			System.out.println("Exception occured");
		}
		catch(NotFound n)
		{
			System.out.println(n.getMessage());
		}
		catch(Exception e)
		{

		}
		
	}
}