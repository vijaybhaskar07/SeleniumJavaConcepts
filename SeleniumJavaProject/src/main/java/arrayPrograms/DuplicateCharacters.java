package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		printDuplicateCharacters("javaselenium");
		printDuplicateCharacters(null);
	}
	
	public static void printDuplicateCharacters(String str) {
		
		if(str == null) {
			System.out.println("Null String");
		}
		if (str == "") {
			System.out.println("Empty String");
		}
		if (str == "a") {
			System.out.println("Single char String");
		}
		
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		//char words[] = str.toCharArray();
		char StringArray[] = str.toCharArray();
		for(Character ch: StringArray) {
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch) + 1);
			}else {
				charMap.put(ch, 1);
			}
			System.out.println(str + " : " + charMap );
		}
		
		//Print the map
		
//		Set <Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
//		for(Map.Entry<Character, Integer> entry: entrySet){
//	    System.out.println(entry.getKey() + ":" + entry.getValue());
//		}
		
		
	}

}
