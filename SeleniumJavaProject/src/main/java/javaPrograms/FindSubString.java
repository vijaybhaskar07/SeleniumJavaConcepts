package javaPrograms;

public class FindSubString {
	
	public static boolean isSubString(String main, String sub) {
		
		return main.matches("(.*)" +sub+ "(.*)");
	}
	
public static boolean isSubString1(String main, String sub) {
		
		return main.contains(sub);
	}

	public static void main(String[] args) {
		
		System.out.println(isSubString("Vijay Automation Test", "Test"));
		System.out.println(isSubString("Vijay Automation Test", " "));
		System.out.println(isSubString("Vijay Automation Test123", "123"));
		
		System.out.println(isSubString1("Vijay Automation Test", "Test"));
		System.out.println(isSubString1("Vijay Automation Test", " "));
		System.out.println(isSubString1("Vijay Automation Test", "123"));

	}

}
