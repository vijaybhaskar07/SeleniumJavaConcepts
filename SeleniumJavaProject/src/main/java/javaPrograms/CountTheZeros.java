package javaPrograms;

public class CountTheZeros {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				count++;
			}
		}
		System.out.println("Number of zeros from 10 to 100:" + count);
	}

}
