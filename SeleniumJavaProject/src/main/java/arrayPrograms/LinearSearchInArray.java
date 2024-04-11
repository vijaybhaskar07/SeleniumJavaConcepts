package arrayPrograms;

public class LinearSearchInArray {

	public static void main(String[] args) {
	
		int[] a = {3,4,5,7,8,9,10};
		
		int eleSearch = 100;
		boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			
			if(eleSearch == a[i]) {
				System.out.println("Element found at: " + i);
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Element not found");
		}
		

	}

}
