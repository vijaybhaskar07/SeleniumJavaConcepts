package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void getCharCount(String name) {

		Map<Character, Integer> charMap = new HashMap<>();
		char[] charArray = name.toCharArray();
		for (char c : charArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println(name + " : " + charMap);
	}

	public static void main(String[] args) {
		getCharCount("testselenium123");

	}

}
