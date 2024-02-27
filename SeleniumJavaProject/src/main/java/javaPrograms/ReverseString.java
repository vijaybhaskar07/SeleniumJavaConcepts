package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "DevonSoftware";
		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverseString = reverseString + str.charAt(i);
		}

		System.out.println("Reverse of a given String: " + reverseString);

		// String Buffer

		String str1 = "VijaySamyu";
		String reverse = new StringBuffer(str1).reverse().toString();
		System.out.println(reverse);

	}

}
