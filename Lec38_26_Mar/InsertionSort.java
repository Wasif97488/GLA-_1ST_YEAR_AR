package Lec38_26_Mar;

import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i=1;i<size;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}

}
