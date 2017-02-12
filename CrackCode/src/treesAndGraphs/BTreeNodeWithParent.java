package treesAndGraphs;

public class BTreeNodeWithParent extends BTreeNode {
	BTreeNodeWithParent parent;
	
	BTreeNodeWithParent() {
		super();
	}
	
	BTreeNodeWithParent(int data) {
		super(data);
	}
	
	public boolean hasParent() {
		return (this.parent != null);
	}

	public BTreeNodeWithParent getParent() {
		return parent;
	}

	public void setParent(BTreeNodeWithParent parent) {
		this.parent = parent;
	}
}
