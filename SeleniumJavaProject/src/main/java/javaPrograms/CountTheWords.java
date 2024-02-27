package javaPrograms;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {

		System.out.println("Enter the words:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();// Hello Java World

		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {

			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;

			}

		}
		System.out.println("Number of words in a string:" + count);
	}

}
