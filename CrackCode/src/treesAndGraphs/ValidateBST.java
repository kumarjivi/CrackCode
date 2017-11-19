package treesAndGraphs;

public class ValidateBST {
	
	public boolean isValidBST(BTreeNode root) {
        if(root == null) {
            return true;
        } else {
                return isValidBSTUtil(root.getLeft(), root.getData(), (long)Integer.MIN_VALUE-1) &&
                    isValidBSTUtil(root.getRight(), (long)Integer.MAX_VALUE+1, root.getData());
        }
	}
    
    public boolean isValidBSTUtil(BTreeNode node, long max, long min) {
		if(node == null) {
			return true;
		} else {
			if(node.getData() <= min || node.getData() >= max) {
                return false;
            } else {
                return isValidBSTUtil(node.getLeft(), node.getData(), min) &&
                    isValidBSTUtil(node.getRight(), max, node.getData());
            }
		}
    }
}
