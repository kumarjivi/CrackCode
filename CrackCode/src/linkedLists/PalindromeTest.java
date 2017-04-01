package linkedLists;

import util.SingleLinkedListUtil;

public class PalindromeTest {

	public static void main(String[] args) {
		SingleNode rootOne = new SingleNode(9);
		LinkedListOperations.insertAtEnd(rootOne, 7);
		LinkedListOperations.insertAtEnd(rootOne, 8);
		LinkedListOperations.insertAtEnd(rootOne, 6);
		LinkedListOperations.insertAtEnd(rootOne, 8);
		LinkedListOperations.insertAtEnd(rootOne, 7);
		LinkedListOperations.insertAtEnd(rootOne, 9);
		
		System.out.println("Input List:");
		SingleLinkedListUtil.printList(rootOne);
		System.out.println("Is list Palindrome?");
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.isPalindrome(rootOne));
	}
}
