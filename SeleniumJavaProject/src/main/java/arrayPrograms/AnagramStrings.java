package arrayPrograms;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		
		String str1 = "Race";
		String str2 = "Care";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//check if length of the strings are same
		if(str1.length() == str2.length()) {
		
		//Convert the strings to char array
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		//Sort the char array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		//if sorted char arrays are same, then the given strings are anagram
		boolean result = Arrays.equals(charArray1, charArray2);
		if(result) {
			System.out.println(str1 + " and " + str2 +  " are anagram");
		}
		else {
			System.out.println(str1 + " and " +str2+ " are not anagram");
		}
		}

	}

}
