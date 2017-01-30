package linkedLIsts;

public class ReverseLinkedList {
	public SingleNode getReverseList(SingleNode singleNode) {
		SingleNode prev = null;
		SingleNode curr = singleNode;
		SingleNode next = null;
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		singleNode = prev;
		return singleNode;
	}
}