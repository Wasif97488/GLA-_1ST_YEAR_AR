package Lec30_16_Mar;

import java.util.Scanner;

public class PrintArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the size of Array");
		int size = sc.nextInt();
		double[] d = new double[size];
		
		for(int i=0;i<size;i++)
		{
			d[i]=sc.nextDouble();
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(d[i]);
		}
	}

}
