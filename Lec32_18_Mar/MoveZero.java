package Lec32_18_Mar;

import java.util.Scanner;

public class MoveZero {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int size= sc.nextInt();
		 int[] a = new int[size];
		 
		 for(int i=0;i<size;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 
		 int[] ans= new int[size];
		 int k=0;
		 for(int i=0;i<size;i++)
		 {
			 if(a[i]!=0)
			 {
				 ans[k++]=a[i];
			 }
		 }
		 for(int i=k+1;i<size;i++)
		 {
			 a[i]=0;
		 }
		 
		 for(int i=0;i<size;i++)
		 {
			 System.out.println(ans[i]);
		 }
		 
		 
		 
		 }
}
