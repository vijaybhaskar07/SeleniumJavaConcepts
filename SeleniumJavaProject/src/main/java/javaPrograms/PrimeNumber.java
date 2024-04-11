package javaPrograms;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		
		
		for (int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumber(int num) {
		for (int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i);
			}
		}
		 
	}

	public static void main(String[] args) {
		
		System.out.println("2 is Prime Number: " +isPrimeNumber(2));
		getPrimeNumber(20);
	}

}
