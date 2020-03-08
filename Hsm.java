package main;

import java.util.*;
import java.io.*;
import exception.*;
import info.*;
import student.*;
import exception.*;

class Hsm
{


	public static void main(String[] args) {
		String path = "Student Information";
		File file = new File(path);
		boolean bool = file.exists();
		if(!bool)
			file.mkdir();
		while(!Login.login());
		Scanner s = new Scanner(System.in);
		
		int choice;
		do
		{
			
			new Menu();
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
				new Registration();
				break;
				case 2:
				new Search();
				break;
				case 3:
				new Information();
				break;
				case 4:
				new Rules();
				break;
				case 5:
				System.out.println("\n\t\t\tThank You");
				break;
				default:
				System.out.println("Enter Correct Choice");
				break;
			}
		}while(choice!=5);
	}
}