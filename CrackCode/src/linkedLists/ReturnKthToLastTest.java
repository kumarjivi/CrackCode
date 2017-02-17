package linkedLists;

import util.SingleLinkedListUtil;

public class ReturnKthToLastTest {

	public static void main(String[] args) {
		ReturnKthToLast returnKthToLast = new ReturnKthToLast();
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
		SingleLinkedListUtil.printList(root);
		SingleNode node = returnKthToLast.getKthToLastNode1(root, 1);
		System.out.println(node.getData());
	}

}
