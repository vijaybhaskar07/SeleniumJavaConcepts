package javaPrograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String str = "Welcome To Java";
		String[] words = str.split(" ");
		
		String reverseString = "";
		
		for(String w: words) {
			
			String reverseWord="";
			for(int i=w.length()-1; i>=0; i--) {
				reverseWord = reverseWord+w.charAt(i);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		
		
           System.out.println(reverseString);
	}

}
