package Lec11_23_Jan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User_Input_Using_Buffer {
	
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s= br.readLine();
		int a = Integer.parseInt(s);
		String s1= br.readLine();
		double d=Double.parseDouble(s1);
		System.out.println(a);
		System.out.println(d);
		
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		float f =  Float.parseFloat(br1.readLine());
		System.out.println(f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
