package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaProgramsPractice {
	
	public static boolean isPrime(int num) {
		
		if(num <=1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if (num % i == 0) {
				return false;
			}
			
		}
		return true;
		
	}
	
	public static void getPrimeNumber(int num) {
		for (int i=50; i<=num; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		if(isPrime(num)) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println("Given number is not prime");
		}
		getPrimeNumber(100);
//		System.out.println("11 is Prime Number: " + isPrime(11));
//		System.out.println("1 is Prime Number: " + isPrime(1));
//		System.out.println("0 is Prime Number: " + isPrime(0));
//		System.out.println("-1 is Prime Number: " + isPrime(-1));
	
	}
	
}
