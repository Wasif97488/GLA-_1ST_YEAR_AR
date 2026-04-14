package Lec46_09_Apr;

public class MethodOverloading {
	
	public static void m1(int a)
	{
		System.out.println("Integer value");
		System.out.println(a);
	}
	
	public static void m1(double d)
	{
		System.out.println("DOuble function");
		System.out.println(d);
	}
	
	public static void m1(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String args[])
	{
//		m1("wasif");
//		m1(10.5);
//		m1(20);
		byte b = 10;
//		m1('w');
		m1(b);
	}

}
