package javaConcepts;

public class TryCatch {

	public static void main(String[] args) {
	
		int i = 10;
		int j = 0;
		
		try {
			int k = i/j;
		} catch (ArithmeticException e) {			
			System.out.println("Some thing wen wrong: " +e);
	}

	}
}
