package Lec19_05_Feb;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Number");
		int num = sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		Integer.MAX_VALUE
		
		System.out.println(rev);
	}

}
