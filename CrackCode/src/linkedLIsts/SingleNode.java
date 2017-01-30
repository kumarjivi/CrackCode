package linkedLIsts;
/**
 * 
 * @author Kumar
 * In all the exercises related to Single linked lists, we will use this class as the node
 * to construct lists.
 */
public class SingleNode {
	public int data;
	public SingleNode next;
	
	public int getData() { return this.data; }
	public SingleNode getNext() { return this.next; }
	public void setData(int value) { this.data = value; }
	public void setNext(SingleNode singleNode) { this.next = singleNode; }
	
	public SingleNode (int value, SingleNode next) {
		SingleNode singleNode = new SingleNode();
		singleNode.setData(value);
		singleNode.setNext(next);
	}
	
	public SingleNode() {super();}
}