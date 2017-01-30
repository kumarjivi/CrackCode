package arraysAndStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import sorting.QuickSort;

/*
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures.
 */
public class IsUnique {
	
	//checks if string contains all unique characters with additional data structures.
	public boolean hasAllUniqueCharsOne(String input) {
		Set<Character> charSet = new HashSet<>();
		for(char c: input.toCharArray()) {
			charSet.add(c);
		}
		return (charSet.size() == input.length());
	}
	
	//checks if string contains all unique characters without additional data structures.
	public boolean hasAllUniqueCharsTwo(String input) {
		//sort it and then check for 2 consecutive characters to be same.
		char[] a = input.toCharArray();
		Arrays.sort(a);
		input = new String (a);
		System.out.println(input);
		for(int i=0; i<input.length()-1; i++) {
			if(input.charAt(i) == input.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	//checks if string contains all unique characters without additional data structures.
		public boolean hasAllUniqueCharsThree(String input) {
			int checker = 0;
			for(int i=0; i<input.length(); i++) {
				int value = input.charAt(i) - 'a';
				if((checker & (1 << value)) > 0) {
					return false;
				}
				checker = checker | (1 << value);
			}
			return true;
		}
	
}
