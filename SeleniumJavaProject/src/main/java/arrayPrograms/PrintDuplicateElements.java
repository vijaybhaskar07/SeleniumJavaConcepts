package arrayPrograms;

public class PrintDuplicateElements {

	public static void main(String[] args) {
		
		int[] arr = {3,5,7,9,6,2,3,5,9};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+ " ");
				}
			}
			
		}

		

	}

}
