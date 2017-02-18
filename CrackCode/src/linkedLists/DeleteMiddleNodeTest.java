package linkedLists;

import util.SingleLinkedListUtil;

public class DeleteMiddleNodeTest {

	public static void main(String[] args) {
		SingleNode root = new SingleNode(23);
		SingleNode node53 = new SingleNode(53);
		SingleNode node24 = new SingleNode(24);
		SingleNode node64 = new SingleNode(64);
		SingleNode node546 = new SingleNode(546);
		SingleNode node545 = new SingleNode(545);
		SingleNode node57 = new SingleNode(57);
		SingleNode node43 = new SingleNode(43);
		SingleNode node54 = new SingleNode(54);
		root.setNext(node53);
		node53.setNext(node24);
		node24.setNext(node64);
		node64.setNext(node546);
		node546.setNext(node545);
		node545.setNext(node57);
		node57.setNext(node43);
		node43.setNext(node54);
//		LinkedListOperations.insertAtEnd(root, 53);
//		LinkedListOperations.insertAtEnd(root, 24);
//		LinkedListOperations.insertAtEnd(root, 64);
//		LinkedListOperations.insertAtEnd(root, 546);
//		LinkedListOperations.insertAtEnd(root, 545);
//		LinkedListOperations.insertAtEnd(root, 57);
//		LinkedListOperations.insertAtEnd(root, 43);
//		LinkedListOperations.insertAtEnd(root, 54);
		SingleLinkedListUtil.printList(root);
		DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode();
		deleteMiddleNode.deleteThisNode(node546);
		SingleLinkedListUtil.printList(root);
	}

}
