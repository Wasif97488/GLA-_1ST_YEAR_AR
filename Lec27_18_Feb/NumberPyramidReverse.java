package Lec27_18_Feb;

public class NumberPyramidReverse {
	
	public static void main(String[] args) {
		
		int n=5;
		int space=0;
		for(int i=1;i<=2*n-1;i++)
		{
			if(i<=n)
				space=i;
			else
				space--;
			
			//task 1 space 
			for(int j=n-space;j>=1;j--)
			{
				System.out.print(" ");
			}
			
			//task 1 star
			int number=1;
			for(int k=1;k<=2*space-1;k++)
			{
				if(k<space)
				System.out.print(number++);
				else
					System.out.print(number--);
			}
			
			//next line
			System.out.println();
			
			
		}
	}

}
