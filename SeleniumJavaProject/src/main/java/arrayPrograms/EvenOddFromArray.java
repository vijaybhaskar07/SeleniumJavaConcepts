package arrayPrograms;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Even numbers are:");
		
		/*for(int i=0; i<a.length; i++ ) {
			if(a[i]%2==0) {
				System.out.print(a[i]+ " ");
			}
		}
		System.out.println("Odd numbers are:");
		for(int i=0; i<a.length; i++ ) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+ " ");
			}
		}
		*/
		for(int value: a) {
			if(value%2==0) {
				System.out.print(value+ " ");
			}
			
		}
		System.out.println();
		System.out.println("odd numbers are:");
		for(int value: a) {
			if(value%2!=0) {
				System.out.print(value+ " ");
			}
			
		}

	}

}
