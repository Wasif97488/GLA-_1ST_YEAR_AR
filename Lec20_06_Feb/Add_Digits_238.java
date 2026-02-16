package Lec20_06_Feb;

import java.util.Scanner;

public class Add_Digits_238 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		
		while(num>9)
			{
			sum=0;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum+rem;
			num=num/10;
		}
		if(sum<=9)
			System.out.println(sum);
	     
		num =sum;
		
			}
		
		
	}

}
