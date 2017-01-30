package linkedLIsts;

public class ReverseLinkedList {
	public Node getReverseList(Node node) {
		Node prev = null;
		Node curr = node;
		Node next = null;
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		node = prev;
		return node;
	}
}