package javaPrograms;

public class CountEvenAndOddNumbers {

	public static void main(String[] args) {
		
		int num = 324567891;
		int evenCount = 0;
		int oddCount = 0;
		
		while(num>0) {
			int r = num % 10;
			if(r % 2 ==0) {
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			
			num = num/10;
		}
		System.out.println("Even count in a given number: " +evenCount);
		System.out.println("Even count in a given number: " +oddCount);
	}

}
