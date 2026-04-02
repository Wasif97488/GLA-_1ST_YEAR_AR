package Lec39_30_Mar;

import java.util.Scanner;

public class DiagonalSum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col=sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int Leftsum=0;
		int Rightsum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					Leftsum=Leftsum+arr[i][j];
				}
				
				if((i+j)==row-1)
					Rightsum=Rightsum+arr[i][j];
			}
		}
		System.out.println(Leftsum);
		System.out.println(Rightsum);
	}

}
