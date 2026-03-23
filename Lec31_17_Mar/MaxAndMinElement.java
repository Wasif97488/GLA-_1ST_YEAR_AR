package Lec31_17_Mar;

import java.util.Scanner;

public class MaxAndMinElement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]= sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=1;i<size;i++)
		{
			if(a[i]>max)
				max=a[i];
			
			if(a[i]<min)
				min=a[i];
			
			
		}
		
		System.out.println("The Max Element is :"+max+" The Min Element is: "+min);
	}

}
