package arraysAndStrings;

import java.util.Arrays;
//case sensitive. 
public class CheckPermutation {
	public boolean checkPermutation (String first, String second) {
		//Assuming that two nulls can't be permutation of each other.
		if(first == null || second == null || first.length() != second.length()) {
			return false;
		}
		//sort both the arrays
		//check char by char
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		for(int i=0; i<firstArray.length; i++) {
			if(firstArray[i] != secondArray[i]) {
				return false;
			}
		}
		return true;
	}
}
