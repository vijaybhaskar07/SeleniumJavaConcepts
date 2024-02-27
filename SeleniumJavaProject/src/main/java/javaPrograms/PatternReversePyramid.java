package javaPrograms;

public class PatternReversePyramid {

	public static void main(String[] args) {
	
		int row =6;
		for(int i=0; i<row; i++) {
			for(int j=0; j<i; j++)
				System.out.print(" ");
			for (int j=i; j<row; j++)
				System.out.print("* ");
			System.out.println();
		}

	}

}
