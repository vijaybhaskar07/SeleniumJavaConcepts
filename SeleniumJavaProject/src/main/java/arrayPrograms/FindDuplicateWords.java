package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) {
		
		String names[] = {"Java", "C", "C++", "Ruby", "JavaScript", "TypeScript", "Java"};
		
		// Compare each element
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println(names[i]);
					
				}
			}
		}
		
		Set<String> storeNames = new HashSet<String>();
		
		for(String name: names) {
			if(storeNames.add(name)== false) {
				System.out.println("Duplicate elements are: " + name); 
			}
		}

	}

}
