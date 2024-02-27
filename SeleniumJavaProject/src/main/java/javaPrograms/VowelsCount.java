package javaPrograms;

import com.google.common.base.CharMatcher;

public class VowelsCount {

	public static boolean isVowel(char t) {

		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';

	}

	public static void main(String[] args) {

		String s = "aeiouAEIOU";
		int vCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
			vCount++;
		}
		}
		System.out.println(vCount);
		
		//By using Google Guava		
		String str = "seleniumtesting";
		int vCount1 = CharMatcher.anyOf("aeiou").countIn(str);
		System.out.println(vCount1);
	}
	

	
}
