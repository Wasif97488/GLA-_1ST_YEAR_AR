package Lec39_30_Mar;

public class StringImplementation {
	
	public static void main(String[] args) {
		
		String s = "Wasif";
		System.out.println(s.length());
		
		String s1="";
		System.out.println(s1.length());
		
//		String s2=null;
//		System.out.println(s2.length());
		
		String s3="wasif";
		System.out.println(s3.charAt(1));
		System.out.println(s3.charAt(4));
//		System.out.println(s3.charAt(5));
//		System.out.println(s3.charAt(-1));
		
		String s4="codingblocks";
		System.out.println(s4.substring(3,9));;
//		System.out.println(s4.substring(6,12));
		System.out.println(s4.substring(6));
		System.out.println(s4.charAt(s4.length()-1));
		String s5="";
		for(int i=s4.length()-1;i>=0;i--)
		{
			s5=s5+s4.charAt(i);
		}
		System.out.println(s5);
		

	}

}
