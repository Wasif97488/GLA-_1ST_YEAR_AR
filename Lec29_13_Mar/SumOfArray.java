package Lec29_13_Mar;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		
		int sum=0;
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
//		int sum=0;
//		for(int i=0;i<size;i++)
//		{
//			sum=sum+a[i];
//		}
		System.out.println(sum);
	}

}
