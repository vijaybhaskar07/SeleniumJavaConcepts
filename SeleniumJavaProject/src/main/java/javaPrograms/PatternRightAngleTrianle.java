package javaPrograms;

import java.util.Scanner;

public class PatternRightAngleTrianle {

	public static void main(String[] args) {
	
		int row;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number row : " );
		row = s.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println("");
		}
		
		
	}

}
