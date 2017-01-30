package linkedLists;
/**
 * In all the exercises related to Single linked lists, we will use this class as the node
 * to construct lists.
 * @author Kumar
 * 
 */
public class SingleNode {
	public int data;
	public SingleNode next;
	
	public int getData() { return this.data; }
	public SingleNode getNext() { return this.next; }
	public void setData(int value) { this.data = value; }
	public void setNext(SingleNode singleNode) { this.next = singleNode; }
	
	public SingleNode (int value, SingleNode next) {
		this.setData(value);
		this.setNext(next);
	}
	
	public SingleNode() {super();}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!SingleNode.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		SingleNode n = (SingleNode)obj;
		return (this.getData() == n.getData());
	}
	
}