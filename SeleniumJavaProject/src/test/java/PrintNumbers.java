
public class PrintNumbers {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=100; i++) {
			
			if(i%3 ==0 && i%5==0){
				System.out.println("pizzbuzz");
			}
			else if(i%5==0) {
				System.out.println("buzz");
			}
			else if(i%3 == 0) {
				System.out.println("pizz");
			}			
			else{
				System.out.println(i);
			}
			
		}

	}

}
