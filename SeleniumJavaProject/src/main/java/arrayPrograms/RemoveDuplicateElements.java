package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
	
		ArrayList<Character> character = new ArrayList<Character>(Arrays.asList('c', 'v', 'a', 's', 's'));
		
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>(character); 
		
		ArrayList<Character> numbersWithoutDuplicates = new ArrayList<Character>(linkedHashSet);
		
		System.out.println(numbersWithoutDuplicates);
	}

}
