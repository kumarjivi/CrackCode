package arraysAndStrings;

/*Write a method to replace all spaces in a string with'%20'. You may assume that
the string has sufficient space at the end of the string to hold the additional
characters, and that you are given the "true" length of the string. (Note: if implementing
in Java, please use a character array so that you can perform this operation
in place*/

public class Urlify {	
	public static char[] replaceSpace(char[] input) {
		int first = input.length-1;
		int index = first;
		while(input[first] == ' ') {
			first--;
		}
		while (first!=0) {
			if(input[first] == ' ') {
				input[index--] = '0';
				input[index--] = '2';
				input[index--] = '%';
			} else {
				input[index--] = input[first];
			}
			first--;
		}
		return input;
	}

	public static void main(String args[]) {
		String str = "My Name is Khan      ";
		char[] output =	Urlify.replaceSpace(str.toCharArray());
		int i = 0;
		while(i < output.length) {
			System.out.print(output[i]);
			i++;
		}
	}
}