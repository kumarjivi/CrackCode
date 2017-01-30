package arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Kumar
 *
 * Given a String, write a method to check if it is a permutation of a palindrome.
 * 
 */
public class PalindromePermutation {
	/**
	 * method uses a hash table and checks that no more than one character has
	 * odd number of occurrences.
	 * Assuming that the String is not case-sensitive.
	 * @param input
	 * @return true if input is a permutation of a palindrome.
	 */
	public boolean checkPalindromePermutation1(String input) {
		boolean isPermutation = true;
		Map<Character, Integer> charCountMap = null;
		if(input != null && input.length() > 0) {
			String str = input.toLowerCase();
			charCountMap = new HashMap<>();
			for(char c: str.toCharArray()) {
				int existingCount = 0;
				if(charCountMap.containsKey(c)) {
					existingCount = charCountMap.get(c);
				}
				charCountMap.put(c, existingCount+1);
			}
			boolean oddOccurance = false;
			for(int count : charCountMap.values()) {
				if(count %2 != 0) {
					if(!oddOccurance) {
						oddOccurance = true;
					} else {
						isPermutation = false;
						break;
					}
				}
			}
			return isPermutation;
		} else {
			return false;
		}
	}
	
	/**
	 * Assuming that the String is ASCII string.
	 * Method uses a string to store odd occurrences of every character at defined spots.
	 * if there are more than one 1s in the string, return false. 
	 * @param input
	 * @return true if input is a permutation of a palindrome.
	 */
	public boolean checkPalindromePermutation2(String str) {
		boolean isPermutation = true;
		if(str != null && str.length() > 0) {
			String input = str.toLowerCase();
			StringBuilder oddEvenString = new StringBuilder();
			for(int i=0; i<128;i++) {
				oddEvenString.append("0");
			}
			for(char c: input.toCharArray()) {
				int index = (int)c;
				oddEvenString.setCharAt(index, (char)((int)(oddEvenString.charAt(index)^1)));
			}
//			System.out.println(oddEvenString);
			int sum = 0;
			for(int i=0; i<oddEvenString.length(); i++) {
				sum += Character.getNumericValue(oddEvenString.charAt(i));
			}
			if (sum>1) {
				isPermutation = false;
			}
		} else {
			return false;
		}
		return isPermutation;
	}
}
