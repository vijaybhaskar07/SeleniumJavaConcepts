package arrayPrograms;

import java.util.Arrays;

public class BinarySearchInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean flag = false;
		int key = 11;
		int l = 0;
		int h = a.length - 1;

		while (l <= h) {

			int m = (l + h) / 2;
			if (a[m] == key) {
				System.out.println("Element found..");
				flag = true;
				break;
			}
			if (a[m] < key) {
				l = m + 1;
			}
			if (a[m] > key) {
				h = m - 1;
			}

		}
		if (flag == false) {
			System.out.println("Element not found..");
		}
		//by using inbuilt function
		System.out.println(Arrays.binarySearch(a, 10));
	}

}
