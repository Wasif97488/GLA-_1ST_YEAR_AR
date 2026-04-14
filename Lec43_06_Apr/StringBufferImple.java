package Lec43_06_Apr;

public class StringBufferImple {
    public static void main(String[] args) {
		
//    	String s = "wasif";
//    	s=s.concat("hello");
//    	System.out.println(s);
    	
    	StringBuffer sb = new StringBuffer("wasif");
    	sb.append("hello");
    	System.out.println(sb);
    	sb.reverse();
    	System.out.println(sb);
    	sb.append("AR");
    	System.out.println(sb);
	}
}
