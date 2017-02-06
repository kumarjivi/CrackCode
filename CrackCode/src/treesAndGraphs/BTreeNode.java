package treesAndGraphs;

public class BTreeNode {
	private int data;
	private BTreeNode left;
	private BTreeNode right;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BTreeNode getLeft() {
		return left;
	}
	public void setLeft(BTreeNode left) {
		this.left = left;
	}
	public BTreeNode getRight() {
		return right;
	}
	public void setRight(BTreeNode right) {
		this.right = right;
	}
	
	public BTreeNode(){
		super();
	}
	public BTreeNode(int value) {
		this.data = value;
		this.setLeft(null);
		this.setRight(null);
	}
	
}
