package linkedLIsts;
/**
 * 
 * @author Kumar
 * In all the exercises related to Single linked lists, we will use this class as the node
 * to construct lists.
 */
public class Node {
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