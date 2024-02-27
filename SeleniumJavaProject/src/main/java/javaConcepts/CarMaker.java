package javaConcepts;


class HondaCar implements Car{
	
	public void engine()
	{
		System.out.println("Honda Car Engine");
	}
	
	public void abs() 
	{
		System.out.println("anti braking syatem");
	}

	
	public void airBags() {
		
		System.out.println("air bags");
	}
	
}

public class CarMaker {

	public static void main(String[] args) {
	
		HondaCar obj = new HondaCar();
		obj.engine();
		obj.abs();
		obj.airBags();

	}

}
