
package Lec36_24_Mar;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the element in an array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("ENter the element to be search");
		int search = sc.nextInt();
		int count=0;
		boolean flag=false;
		int i=0;
		for(;i<size;i++)
		{
			if(arr[i]==search)
			{
//				count++;
				flag=true;
			break;
			}
//				System.out.println(i);
//			else
//				System.out.println(-1);
		}
		if(flag==true)
			System.out.println(i);
		else
			System.out.println(-1);
	}

}
