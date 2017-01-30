package linkedLIsts;

import java.util.List;

class Node {
	public int data;
	public Node next;
	
	public int getData() { return this.data; }
	public Node getNext() { return this.next; }
	public void setData(int value) { this.data = value; }
	public void setNext(Node node) { this.next = node; }
	
	public Node (int value, Node next) {
		Node node = new Node();
		node.setData(value);
		node.setNext(next);
	}
	
	public Node() {super();}
}

public class ReverseLinkedList {
	public Node getReverseList(Node node) {
		if(node == null) {
			return null;
		}
		Node prev = null;
		Node curr = node;
//		Node next= node.getNext();
		Node next = null;
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
//			if(next != null) {
//				next = next.getNext();
//			}
//			next = next.getNext();
		}
		node = prev;
		return node;
	}
}