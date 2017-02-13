package treesAndGraphs;
/***
 * Design an algorithm and write code to find the first common ancestor of two
 * nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE:
 * This is not necessarily a binary search tree
 * @author Kumar
 *
 */
public class CommonAncestor {
	/**
	 * Assuming that the link to parent node is given.
	 * @param node1
	 * @param node2
	 * @return
	 */
	public BTreeNodeWithParent getCommonAncestor(BTreeNodeWithParent node1, BTreeNodeWithParent node2) {
		int d1 = getDepth(node1);
		int d2 = getDepth(node2);
		int diff = Math.abs(d1-d2);
		BTreeNodeWithParent upperNode = null;
		BTreeNodeWithParent deeperNode = null;
		if(d1 > d2) {
			deeperNode = node1;
			upperNode = node2;
		} else if(d2 > d1) {
			deeperNode = node2;
			upperNode = node1;
		} else {
			deeperNode = node1;
			upperNode = node2;
		}
		for(int i=0; i<diff; i++) {
			deeperNode = deeperNode.getParent();
		}
		BTreeNodeWithParent parent1 = deeperNode;
		BTreeNodeWithParent parent2 = upperNode;
		while(parent1 != null) {
			if(parent1 != parent2) {
				parent1 = parent1.getParent();
				parent2 = parent2.getParent();
			} else {
				break;
			}
		}
		return parent1;
	}
	/**
	 * Assuming that link to parent node is not given.
	 * @param node1
	 * @param node2
	 * @param root
	 * @return
	 */
	public BTreeNode getCommonAncestor(BTreeNode node1, BTreeNode node2, BTreeNode root) {
		BTreeNode n = null;
		boolean n1InLeft = false;
		boolean n2InLeft = false;
		if(root == node1 || root == node2) {
			return root;
		} else if (containsNode(node1, node2)) {
			return node1;
		} else if(containsNode(node2, node1)) {
			return node2;
		} else {
			while(root != null) {
				n1InLeft = containsNode(root.getLeft(), node1);
				n2InLeft = containsNode(root.getLeft(), node2);
				if(n1InLeft && n2InLeft) {
					root = root.getLeft();
				} else if(!n1InLeft && !n2InLeft) {
					root = root.getRight();
				} else {
					n = root;
					break;
				}
			}
		}
		return n;
	}
	public int getDepth(BTreeNodeWithParent node) {
		int depth = -1;
		while(node != null) {
			node = node.getParent();
			depth++;
		}
		return depth;
	}

	public boolean containsNode(BTreeNode root, BTreeNode node) {
		if(root == null || node == null) {
			return false;
		}
		if(root == node) {
			return true;
		} else {
			return (containsNode(root.getLeft(), node) ||
					containsNode(root.getRight(), node));
		}
	}
}
