package linkedLists;

import util.SingleLinkedListUtil;

public class Partiotiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partition partition = new Partition();
		SingleNode root = new SingleNode(23);
		LinkedListOperations.insertAtEnd(root, 11);
		LinkedListOperations.insertAtEnd(root, 7);
		LinkedListOperations.insertAtEnd(root, 8);
		LinkedListOperations.insertAtEnd(root, 9);
		LinkedListOperations.insertAtEnd(root, 6);
		LinkedListOperations.insertAtEnd(root, 14);
		LinkedListOperations.insertAtEnd(root, 20);
		LinkedListOperations.insertAtEnd(root, 4);
		SingleLinkedListUtil.printList(root);
		//SingleNode head = partition.getPartitionedList(root, 11);
		SingleNode head = partition.getPartitionedList1(root, 11);
		SingleLinkedListUtil.printList(head);
	}

}
