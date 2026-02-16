package Lec20_06_Feb;

import java.util.Scanner;

public class DuckNumber {
	
	  public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  int num = sc.nextInt();
		  int count=0;
		  while(num!=0)
		  {
			  int rem = num%10;
			  if(rem==0)
			  {
				  count++;
				  break;
			  }
			  num = num/10;
			  
		  }
		  if(count==1)
			  System.out.println("Duck Number ");
		  else
		  System.out.println("Not a Duck Number");
	}

}
