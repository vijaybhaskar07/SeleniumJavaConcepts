package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
	
	
		List<Character> character = new ArrayList<>(Arrays.asList('c', 'v', 'a', 's', 's','b'));
	
		Set<Character> set = new HashSet<>(character); 
		
		List<Character> numbersWithoutDuplicates = new ArrayList<>(set);
		
		System.out.println(numbersWithoutDuplicates);
	}

}
