package treesAndGraphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/***
 * Given a binary tree, design an algorithm which creates a linked list of all the
 * nodes at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
 * @author Kumar
 */
public class LevelListFromTree {
	
	public List<List<Integer>> getLevelListFromTree(BTreeNode root) {
		List<List<Integer>> finalList = new LinkedList<>();
		if (root == null) {
			return null;
		}
		Queue<BTreeNode> primQ = new LinkedList<>();
		Queue<BTreeNode> secQ = new LinkedList<>();
		boolean usePrim = true;
		primQ.add(root);
//		Queue mainQueue = null;
//		Queue secQueue = null;
//		mainQueue = primQ;
//		secQueue = secQ;
//		
		while(!primQ.isEmpty() || !secQ.isEmpty()) {
			List<Integer> l = new LinkedList<>();
			
			if(usePrim) {
				while(!primQ.isEmpty()) {
					BTreeNode n = primQ.poll();
					if(n.getLeft()!=null) {
						secQ.add(n.getLeft());
					}
					if(n.getRight() != null) {
						secQ.add(n.getRight());
					}
					l.add(n.getData());
				}
				usePrim = false;
			} else {
				while(!secQ.isEmpty()) {
					BTreeNode n = secQ.poll();
					if(n.getLeft()!=null) {
						primQ.add(n.getLeft());
					}
					if(n.getRight() != null) {
						primQ.add(n.getRight());
					}
					l.add(n.getData());
				}
				usePrim = true;
			}
			finalList.add(l);
		}
		return finalList;
	}
}
