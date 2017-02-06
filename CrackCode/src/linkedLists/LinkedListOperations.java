package linkedLists;

import util.SingleLinkedListUtil;

/***
 * 
 * This class is responsible for doing basic operations, namely inserting a node, deleting a node, and
 * updating a node for a Single LinkedList.
 * After every operation, the head of the Single linkedlist should be returned.
 * @author Kumar
 * 
 */
public class LinkedListOperations {
	/**
	 * method to insert a node in the Single LinkedList.
	 * if position > no. of nodes in the Single Linked List, element is inserted at the end of the list.
	 * @param head: head node of the Single LinkedList in which nodeToInsert is to be inserted.
	 * @param nodeToInsert: new node to insert.
	 * @param position: after which nodeToInsert should be inserted. 0 means at the start.
	 * @return head of the SingleLinkeddList with nodeToInsert node inserted after specified position.
	 */
	public SingleNode insertNode(SingleNode head, SingleNode nodeToInsert, int position) {
		SingleNode headCopy = head;
		int pos = 1;
		if(position == 0) {
			return insertAtStart(head, nodeToInsert);
		} else if(position >= SingleLinkedListUtil.getlength(head)) {
			return insertAtEnd(head, nodeToInsert);
		} else {
			while(pos < position ) {
				head = head.getNext();
				pos++;
			}
			SingleNode next = head.getNext();
			nodeToInsert.setNext(next);
			head.setNext(nodeToInsert);
			return headCopy;
		}
	}
	
	private static SingleNode insertAtStart(SingleNode head, SingleNode nodeToInsert) {
		if(nodeToInsert != null) {
			nodeToInsert.setNext(head);
		}
		return nodeToInsert;
	}
	
	private static SingleNode insertAtEnd(SingleNode head, SingleNode nodeToInsert) {
		SingleNode headCopy = head;
		SingleNode prev = head;
		while(head != null) {
			prev = head;
			head = head.getNext();
		}
		prev.setNext(nodeToInsert);
		return headCopy;
	}
	
	public SingleNode deleteANode(SingleNode head, SingleNode nodeToDelete) {
		if(head == nodeToDelete) {
			return deleteFirstNode(head);
		}
		SingleNode headCopy = head;
		SingleNode prev = null;
		SingleNode curr = head;
		SingleNode next = curr;
		if(head != null) {
			next = curr.getNext();
			while(next != null && curr != (nodeToDelete)) {
//			while(next != null && !curr.equals(nodeToDelete)) {
				prev = curr;
				curr = next;
				next = next.getNext();
			}
			prev.setNext(curr.getNext());
		}
		return headCopy;
	}
	
	public SingleNode deleteFirstNode(SingleNode head) {
		if(head != null) {
			return head.getNext();
		}
		return head;
	}
	
	public SingleNode deleteLastNode(SingleNode head) {
		SingleNode headCopy = head;
		SingleNode prev = null;
		SingleNode curr = head;
		SingleNode next = curr;
		if(curr != null) {
			next = curr.getNext();
			while(next != null) {
				prev = curr;
				curr = next;
				next = next.getNext();
			}
			prev.setNext(null);;
		}
		return headCopy;
	}
	
	public SingleNode deleteNodeByPosition(SingleNode head, int positionToDelete) {
		SingleNode headCopy = head;
		if(positionToDelete == 1) {
			return deleteFirstNode(head);
		} else if(positionToDelete == SingleLinkedListUtil.getlength(head)) {
			return deleteLastNode(head);
		} else {
			int pos = 1;
			SingleNode prev = null;
			SingleNode curr = head;
			SingleNode next = curr;
			if(head != null) {
				next = curr.getNext();
				while(next != null && pos != positionToDelete) {
					prev = curr;
					curr = next;
					next = next.getNext();
					pos++;
				}
				prev.setNext(curr.getNext());
			}
		}
		return headCopy;
	}

	public SingleNode updatedANode(SingleNode head, int updatedValue) {
		//TODO
		return head;
	}
}
