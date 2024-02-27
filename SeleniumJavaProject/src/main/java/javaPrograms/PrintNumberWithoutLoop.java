package javaPrograms;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		printNum(5);
		printNum1(1, 10);
	}

	public static void printNum(int num) {

		if (num <= 10) {
			System.out.println(num);
			num++;
			printNum(num);

		}

	}

	public static void printNum1(int stNum, int endNum) {
		if (stNum <= endNum) {
			System.out.println(stNum);
			stNum++;
			printNum1(stNum, endNum);
		}
	}
}
