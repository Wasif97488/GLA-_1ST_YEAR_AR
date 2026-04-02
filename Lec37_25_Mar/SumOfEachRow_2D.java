package Lec37_25_Mar;

import java.util.Scanner;

public class SumOfEachRow_2D {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row= sc.nextInt();
		int col=sc.nextInt();
		int[][] arr = new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<row;i++)
		{
			sum=0;
			for(int j=0;j<col;j++)
			{
				sum=sum+arr[i][j];
			}
			System.out.println(sum);
		}
	}

}
