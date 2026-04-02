package Lec41_01_Apr;

public class ReverseWord {
	public static void main(String[] args) {
		
		String s = "Welcome to Coding blocks";
		
		         String[] st=s.split(" ");
		         String ans="";
		         for(int i=st.length-1;i>=0;i--)
		         {
		        	      ans=ans+st[i]+" ";
		         }
		         System.out.println(ans.trim());
	}

}
