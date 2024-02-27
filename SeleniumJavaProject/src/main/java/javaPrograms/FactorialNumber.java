package javaPrograms;

public class FactorialNumber {
	
	public static int factNumber(int num) {
		
		int fact =1;
		if(num == 0) 
			return 1;
		
		for (int i=1; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
	
	System.out.println(factNumber(5));
	}

}
