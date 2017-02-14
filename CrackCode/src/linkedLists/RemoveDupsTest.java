package linkedLists;

import util.SingleLinkedListUtil;

public class RemoveDupsTest {

	public static void main(String[] args) {
		SingleNode root = new SingleNode(23);
		LinkedListOperations.insertAtEnd(root, 53);
		LinkedListOperations.insertAtEnd(root, 24);
		LinkedListOperations.insertAtEnd(root, 64);
		LinkedListOperations.insertAtEnd(root, 43);
		LinkedListOperations.insertAtEnd(root, 546);
		LinkedListOperations.insertAtEnd(root, 545);
		LinkedListOperations.insertAtEnd(root, 54);
		LinkedListOperations.insertAtEnd(root, 57);
		LinkedListOperations.insertAtEnd(root, 43);
		LinkedListOperations.insertAtEnd(root, 54);
		LinkedListOperations.insertAtEnd(root, 53);
		
		RemoveDups removeDups = new RemoveDups();
//		SingleNode node = removeDups.removeDupsWithBuffer(root);
		SingleNode node = removeDups.removeDups(root);
		SingleLinkedListUtil.printList(node);
	}

}
