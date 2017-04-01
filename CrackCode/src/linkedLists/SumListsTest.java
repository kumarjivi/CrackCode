package linkedLists;

import util.SingleLinkedListUtil;

public class SumListsTest {

	public static void main(String[] args) {
		SingleNode rootOne = new SingleNode(9);
		LinkedListOperations.insertAtEnd(rootOne, 7);
		LinkedListOperations.insertAtEnd(rootOne, 8);
		
		SingleNode rootTwo = new SingleNode(6);
		LinkedListOperations.insertAtEnd(rootTwo, 8);
		LinkedListOperations.insertAtEnd(rootTwo, 5);
		System.out.println("In ReverseOrder:");
		System.out.println("ListOne");
		SingleLinkedListUtil.printList(rootOne);
		System.out.println("ListTwo");
		SingleLinkedListUtil.printList(rootTwo);
		SumLists lists = new SumLists();
		SingleNode sum = lists.getSumListReverse(rootOne, rootTwo);
		System.out.println("Sum:");
		SingleLinkedListUtil.printList(sum);
	}

}
