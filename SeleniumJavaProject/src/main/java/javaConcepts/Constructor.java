package javaConcepts;

class A 
{

	public A() {
		
		System.out.println("constructor A");
		
	}
	
}

class B extends A
{
	public B() {
		System.out.println("constructor B");
	}
	
	public B(int n) {
		System.out.println("constructor B int");
	}
	
}

public class Constructor {

	public static void main(String[] args) {
	
		B obj = new B(5);
		

	}

}
