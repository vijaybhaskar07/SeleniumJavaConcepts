package javaPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 12345;
		int rev = 0;
		
		while (num != 0) {
			
			rev = rev * 10 + num %10;
			num = num/10;
		}
			System.out.println(rev);
			int num1 = 98765;
			StringBuffer rev1 = new StringBuffer(String.valueOf(num1)).reverse();
			System.out.println(rev1);
			System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}
	


}
