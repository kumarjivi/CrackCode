package sorting;

import util.ArrayUtility;

public class SelectionSort {
	
	public void sort(char[] input) {
		for(int i=0; i<input.length; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i] > input[j]) {
					char temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			System.out.println("After iteration "+(i+1)+" value of input: ");
			new ArrayUtility().printCharArray(input);
		}
	}
	
}
