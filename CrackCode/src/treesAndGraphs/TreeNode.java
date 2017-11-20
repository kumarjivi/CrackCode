package treesAndGraphs;

import java.util.List;

public class TreeNode {
	Character data;
	TreeNode parent;
	List<TreeNode> children;
	
	public TreeNode(Character data) {
		this.data = data;
	}
	public Character getData() {
		return data;
	}
	public void setData(Character data) {
		this.data = data;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	
	
}
