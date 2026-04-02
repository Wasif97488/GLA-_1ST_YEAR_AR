package Lec41_01_Apr;

public class CountOfVowelAndConsonant {
	
	public static void main(String[] args) {
		String s ="WasifArshad@1234&^%";
		int vowel=0;
		int consonant=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
					vowel++;
				else
					consonant++;
			}
		}
		System.out.println(vowel+"    "+consonant);
	}

}
