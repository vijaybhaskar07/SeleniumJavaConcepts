package javaPrograms;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		//Approach1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for a:");
		int a =	sc.nextInt();
		System.out.println("Enter the number for b:");
		int b =	sc.nextInt();
		System.out.println("Enter the number for c:");
		int c =	sc.nextInt();
	
		
		if(a>b && a>c)
		{
			System.out.println(a+ " Number is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+ " Number is largest");
		}
		else 
		{
			System.out.println(c+ " Number is largest");
		}
		
		//Approach2 by using Ternary Operator
		
		int largest1 =  a>b?a:b;
		int largest2 = c>largest1?c:largest1;
		System.out.println(largest2+ " is Largest Number");
		
	}

}
