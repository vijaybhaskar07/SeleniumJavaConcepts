package javaPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 20;
		System.out.println("Before Swap a: " + a + " and b: " + b );
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap a: " + a + " and b: " + b );

	}

}
