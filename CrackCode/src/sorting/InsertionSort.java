package sorting;

public class InsertionSort {
	public void sort(char[] input) {
		for(int i=1; i<input.length; i++) {
			for(int j=0; j<i; j++) {
				if(input[i] < input[j]) {
					char temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
	}
}
