package javaPrograms;

public class RemoveJunk {

	public static void main(String[] args) {

		String str = "test$%^&*()_!@#latin123?><{}{}";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
