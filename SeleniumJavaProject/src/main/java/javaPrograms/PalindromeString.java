package javaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value:");
		String str = sc.next();
		String orgStr = str;
		
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr+str.charAt(i);
		}
        System.out.println(revStr);

	if(orgStr.equals(revStr)) {
		System.out.println("Given value is Palindrome String");
		
	}
	else {
		System.out.println("Given value is not a Palindrome String");
	}

}
}