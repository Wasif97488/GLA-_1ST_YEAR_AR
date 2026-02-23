package lec26_17_Feb;

public class NumberPyramid {
	
	public static void main(String[] args) {
		
		int n=5;
		int number=1;
		for(int i=1;i<=n;i++)
		{
			//task 1 space
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			//task 2 star
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print(number++);
			}
			
			System.out.println();
			
		}
	}

}
