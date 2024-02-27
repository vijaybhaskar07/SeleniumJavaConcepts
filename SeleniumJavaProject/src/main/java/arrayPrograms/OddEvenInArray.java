package arrayPrograms;

public class OddEvenInArray {

	public static void main(String[] args) {
	
		int[] arr = {3,6,5,4,2,8,1,10,7,9};
		
		System.out.println("Even numbers are:");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
			System.out.print(arr[i]+ " ");
			}
		}
		System.out.println();
		System.out.println("Odd numbers are:");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 !=0) {
			System.out.print(arr[i]+ " ");
			}
		}

	}

}
