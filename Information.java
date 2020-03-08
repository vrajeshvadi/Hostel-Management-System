package info;

import java.util.*;

public class Information
{
	public Information()
	{
	
		Scanner s = new Scanner(System.in);
		boolean check = true;
		do
		{
			System.out.println("\n\t\t======================================");
			System.out.println("\n\t\t\t..::ROOMS OF HOSTEL::..");
			System.out.println("\n\t\t======================================");
			System.out.println("\n\t\t 1. :- Standard Rooms");
			System.out.println("\n\t\t 2. :- Luxury Rooms");
			System.out.println("\n\t\t 3. :- Back To Main Menu");
			System.out.println("\n\t\t======================================");
			System.out.print("\n\t\t\t   CHOICE :- ");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1:
			
				new StandardRoom();
				break;
				case 2:
				new LuxuryRoom();
				break;
				case 3:
				check = false;
				break;
			}
		}while(check);
	}
}

class StandardRoom
{
	StandardRoom()
	{
	
		System.out.println("\n\n\t    ====================================================");
		System.out.println("\n\t\t     ..::Standard Rooms for Students::..");
		System.out.println("\n\t    ====================================================");
		System.out.println("\n\t\tRoom Type\tNon-A.C.\tA.C.");
		System.out.println("\n\t\t4 Sharing\t60000\t\t75000");
		System.out.println("\n\t\t2 Sharing\t70000\t\t85000");
		System.out.println("\n\t\t1 Sharing\t110000\t\t140000");
		System.out.println("\n\t    ----------------------------------------------------");
		System.out.println("\n\t\tLaundry Charges\t3500");
		System.out.println("\n\t\tFood-Facility\t35000");
		System.out.println("\n\t    ====================================================");
		System.out.println("\n\t\tEnter any key to continue...");
		Scanner s =new Scanner(System.in);
		String temp = s.next();
	

	}
}

class LuxuryRoom
{
	LuxuryRoom()
	{
		System.out.println("\n\n\t    ====================================================");
		System.out.println("\n\t\t     ..::Luxury Rooms for Students::..");
		System.out.println("\n\t    ====================================================");
		System.out.println("\n\t\tRoom Type\tNon-A.C.\tA.C.");
		System.out.println("\n\t\t4 Sharing\t80000\t\t110000");
		System.out.println("\n\t\t2 Sharing\t120000\t\t135000");
		System.out.println("\n\t\t1 Sharing\t130000\t\t170000");
		System.out.println("\n\t    ----------------------------------------------------");
		System.out.println("\n\t\tLaundry Charges\t7000");
		System.out.println("\n\t\tFood-Facility\t35000");
		System.out.println("\n\t    ====================================================");
		System.out.println("\n\t\tEnter any key to continue...");
		Scanner s =new Scanner(System.in);
		String temp = s.next();
	}
}
