package Lec14_29_Jan;

import java.util.Scanner;

public class MarksGrade {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int mark=sc.nextInt();
		
		int m=mark/10;
		switch(m)
		{
		case 10: System.out.println("A grade");
		break;
		case 9: System.out.println("A grade");
		break;
		case 8: System.out.println("B grade");
		break;
		case 7: System.out.println("C grade");
		break;
		case 6: System.out.println("D grade");
		break;
		default: System.out.println("fail");
		}
	}

}
