package arrayPrograms;


public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {3,5,7,9,11,13};
		System.out.println("Original Array:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Reverse Array:");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}

	}	

}
