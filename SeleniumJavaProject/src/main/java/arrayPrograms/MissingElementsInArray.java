package arrayPrograms;

public class MissingElementsInArray {

	public static void main(String[] args) {
		
		//Array should not have duplicate elements
		
		int num[] = {5,3,1,2,7,6,9,8};
		
		int sum1 = 0;
		
		for(int i=0; i<num.length; i++) {
			
			sum1 = sum1+num[i];
			
			
		}
		System.out.println("Sum of elements in array:" +sum1);
		int sum2 =0;
		for(int i=1; i<=9; i++) {
			
			sum2 = sum2+i;
			
		}
		System.out.println("Sum of elements in array:" +sum2);
		System.out.println("Missing element in array:" + (sum2-sum1));
	}

}
