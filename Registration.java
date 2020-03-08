package student;

import info.*;
import exception.*;
import java.util.*;
import java.io.*;
public class Registration{

	String firstname,lastname,surname,rollnumber,department,semester,college,age,mobilenumber;
	int n;
	String s;

	Scanner scan =new Scanner(System.in);
	public Registration()
	{
		this.n = n;
		this.s = s;
		
		System.out.println("\n\t\t======================================");
		System.out.println("\n\t\t\t..::Registration::..");
		System.out.println("\n\t\t======================================");
		
		
		System.out.print("\n\t\tInput your first name :: ");
		firstname = scan.next();

		System.out.print("\n\t\tInput your last name :: ");
		lastname = scan.next();

		System.out.print("\n\t\tInput your college name :: ");
		college = scan.next();

		System.out.print("\n\t\tInput your department :: ");
		department = scan.next();

		System.out.print("\n\t\tInput your semester :: ");
		semester = scan.next();

		System.out.print("\n\t\tInput your roll number :: ");
		rollnumber = scan.next();

		System.out.print("\n\t\tInput your age :: ");
		age = scan.next();

		System.out.print("\n\t\tInput your mobile number :: ");
		mobilenumber = scan.next();

		
		
		
		
		save();
	}

	void save(){
		String s = "Student Information/"+this.firstname+this.lastname + ".txt";
		try{
			FileWriter f = new FileWriter(s);
			BufferedWriter b = new BufferedWriter(f);
			b.write("Name : " + this.firstname + " " + this.lastname );
			b.newLine();
			b.write("College :" + this.college);
			b.newLine();
			b.write("Department :" + this.department);
			b.newLine();
			b.write("Semester :" + this.semester);
			b.newLine();
			b.write("RollNumber :" + this.rollnumber);
			b.newLine();
			b.write("Age :" + this.age);
			b.newLine();
			b.write("Mobile Number :" + this.mobilenumber);
			b.newLine();
			b.close();
			System.out.println("Registration Successful");
		}
		catch(IOException e){
			System.out.println("SignUp Unsuccessful");
		}
	}

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}