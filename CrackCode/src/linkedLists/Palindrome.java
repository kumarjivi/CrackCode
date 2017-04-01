package linkedLists;
/***
 * March 31, 2017.
 * Write a program to check if a given linked list is a palindrome.
 * @author Kumar
 *
 */
public class Palindrome {
	public boolean isPalindrome(SingleNode root) {
		if(root == null) {
			return false;
		}
		boolean isPalindrome = true;
		boolean isOddLength = false;
		int length = 0;
		SingleNode rootCopy = root;
		while(rootCopy != null) {
			rootCopy = rootCopy.getNext();
			length++;
		}
		rootCopy = root;
		if(length % 2 != 0) {
			isOddLength = true;
		}
		int i=1;
		int[] stack = new int[length];
		int top = -1;
		while(i <= length) {//Or we can use rootCopy != null
			if(i <= length/2) {// we are still in first half of the 
				top++;
				stack[top] = rootCopy.getData();
				i++;
				rootCopy = rootCopy.getNext();
			} else if(isOddLength && i == length/2 + 1) {//if length is odd, skip the middle node.
				rootCopy = rootCopy.getNext();
				i++;
			} else {//Now we have crossed the middle element.
				if(stack[top] != rootCopy.getData()) {
					return false;
				} else {
					top--;
					i++;
					rootCopy = rootCopy.getNext();
				}
			}
		}
		return isPalindrome;
	}
}
