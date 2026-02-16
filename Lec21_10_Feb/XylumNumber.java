package Lec21_10_Feb;

import java.util.Scanner;

public class XylumNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		int count=0;
		int last = temp%10;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		
		int first=(int)(num/Math.pow(10, count-1));
//		System.out.println(first +"    "+last);
		
		int middle = num/10;
		middle = (int)(middle%Math.pow(10, count-2));
//		System.out.println(middle);
		int sum=0;
		while(middle!=0)
		{
			int rem=middle%10;
			sum=sum+rem;
			middle=middle/10;
		}
		
		if(sum==(first+last))
			System.out.println(":Xylum Number");
		else
			System.out.println("Not a Xylum");
	}

}
