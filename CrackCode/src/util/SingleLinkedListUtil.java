package util;

import linkedLists.SingleNode;

public class SingleLinkedListUtil {
	/**
	 * method to return the length of the linked list.
	 * @param head: head node of the Single LinkedList.
	 * @return number of nodes in the linked list
	 */
	public static int getlength(SingleNode head) {
		int length = 0;
		if(head != null) {
			while(head != null) {
				head = head.getNext();
				length++;
			}
		}
		return length;
	}
	
	public static void printList(SingleNode singleNode) {
		while(singleNode != null) {
			System.out.print(singleNode.getData()+"\t");
			singleNode = singleNode.getNext();
		}
		System.out.println();
	}
}
