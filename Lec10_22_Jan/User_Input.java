package Lec10_22_Jan;

import java.util.*;


public class User_Input {
	
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
//	 ArrayList a = new ArrayList();
//	 Stack s = new Stack();
//	 LinkedList l = new LinkedList();
	 System.out.println("Please Enter the First Number-Integer Type");
	  int a=  sc.nextInt();
	System.out.println("Please Enter the Second Number-DOuble Type");
	   double b= sc.nextDouble();
		 System.out.println("Please Enter the Third Number-Float Type");
	   float c=sc.nextFloat();
		System.out.println("Please Enter the Fourth Value-Boolean Type");
	  boolean d= sc.nextBoolean();
	   
	   System.out.println("The First Number is "+a);
	   System.out.println("The Second Number is :"+b);
	   System.out.println("The Third Number is "+c);
	   System.out.println("The Fourth Value is "+d);


	}

}
