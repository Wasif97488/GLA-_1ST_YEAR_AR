package Lec20_06_Feb;

import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		int prd=1;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum+rem;
			prd =prd*rem;
			num=num/10;
		}
		
		System.out.println(prd-sum);
	}

}
