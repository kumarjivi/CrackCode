package treesAndGraphs;
/***
 * Write an algorithm to find the'next'node (i.e., in-order successor) of a given node
 * in a binary search tree. You may assume that each node has a link to its parent
 * @author Kumar
 *
 */
public class SuccessorBSTNode {
	
	public BTreeNodeWithParent getSuccessor(BTreeNodeWithParent node) {
		BTreeNodeWithParent n = null;
		if(node == null) {
			return null;
		}
		//node has right subtree
		if(node.getRight() != null) {
			return getMinOfTree((BTreeNodeWithParent) node.getRight());
		}
		//node doesn't have right sub-tree and is left child of it's parent.
		else if(node != null && node.getParent() != null && node == node.getParent().getLeft()) {
			return node.getParent();
		} 
		//node doesn't have right sub-tree and is right child of it's parent.
		else {
			//keep moving towards parent until the node is left child if it's parent.
			while(node != null && node.hasParent()) {
				if(node == node.getParent().getRight()) {
					node = node.getParent();
				} else {
					break;
				}
			}
			return node.getParent();
		}
	}
	
	public BTreeNodeWithParent getMinOfTree(BTreeNodeWithParent node) {
		if(node == null) {
			return node;
		}
		BTreeNodeWithParent nodeCopy = node;
		while(nodeCopy.getLeft() != null) {
			nodeCopy = (BTreeNodeWithParent) nodeCopy.getLeft();
		}
		return nodeCopy;
	}
}
