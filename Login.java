package info;

import java.util.*;

public class Login
{
	public static boolean login()
	{
		Scanner s = new Scanner(System.in);		
		System.out.println("\n\n\n\t\t\t===============================");
		System.out.println("\n\t\t\t   Hostel Management System");
		System.out.println("\n\t\t\t===============================");
		System.out.print("\n\n\t\t\t     Username :- ");
		String username = s.next();
		System.out.print("\n\t\t\t     Password :- ");
		String password = s.next();
		if(username.equals("vrajesh") && password.equals("vrajesh"))	return true;
		else return false;		
	}
}
