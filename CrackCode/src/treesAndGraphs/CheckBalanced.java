package treesAndGraphs;
/***
Implement a function to check if a tree is balanced.
For the purposes of this question, a balanced tree is defined to be a tree such that
no two leaf nodes differ in distance from the root by more than one

 * @author kumar
 *
 */
public class CheckBalanced {
	public boolean isBalancedTwo(BTreeNode root) {
		return checkHeight(root) != Integer.MIN_VALUE;
	}
	
	public boolean isBalancedOne(BTreeNode root) {
		if(root == null) {
			return true;
		} else {
			int lHeight = getHeight(root.getLeft());
			int rHeight = getHeight(root.getRight());
			if(Math.abs(lHeight - rHeight) > 1) {
				return false;
			} else {
				return isBalancedOne(root.getLeft()) && isBalancedOne(root.getRight());
			}
		}
	}

	public int checkHeight(BTreeNode node) {
		if (node == null) {
			return -1;
		} else {
			int lHeight = checkHeight(node.getLeft());
			int rHeight = checkHeight(node.getRight());
			if (lHeight == Integer.MIN_VALUE || rHeight == Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			int diff = Math.abs(lHeight - rHeight);
			if (diff > 1) {
				return Integer.MIN_VALUE;
			} else {
				return Math.max(lHeight,rHeight) + 1;
			}
		}
	}
	
	public int getHeight(BTreeNode node) {
		if(node == null) {
			return 0;
		} else {
			return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
		}
	}
}
