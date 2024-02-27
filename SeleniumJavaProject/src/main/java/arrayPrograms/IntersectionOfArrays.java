package arrayPrograms;

import java.util.HashSet;

public class IntersectionOfArrays {

	public static void main(String[] args) {

		int[] arr1 = { 3, 5, 7, 9, 3, 2, 6, 5 };
		int[] arr2 = { 6, 4, 1, 10, 5, 7 };

		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					hs.add(arr1[i]);
				}
			}
		}
		for (int no : hs) {
			System.out.print(no+ " ");
		}
	}

}
