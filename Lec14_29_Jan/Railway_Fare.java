package Lec14_29_Jan;

import java.util.Scanner;

public class Railway_Fare {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		System.out.println("Enter the Gender:");
		char gender=sc.next().charAt(0);
		System.out.println("Enter the ticket price");
		double ticketPrice=sc.nextDouble();
		
		
		
		if(age<5)
		{
			ticketPrice=0;
			System.out.println(ticketPrice);
		}
		else if(age>60)
		{
			ticketPrice=ticketPrice-(ticketPrice*0.40);
			System.out.println(ticketPrice);
		}
		else if(gender=='F'|| gender=='f')
		{
			ticketPrice=ticketPrice-(ticketPrice*0.25);
			System.out.println(ticketPrice);
		}
		else
			System.out.println(ticketPrice);

			
		
	}

}
