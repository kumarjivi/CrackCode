package linkedLists;

import util.SingleLinkedListUtil;

/***
 * Find the kth to last element of a singly linked list.
 * @author Kumar
 *
 */
public class ReturnKthToLast {
	/**
	 * Using two pointers to get to the kthToLast node(iteratively).
	 * @param root
	 * @return
	 */
	public static int i=0;
	public SingleNode getKthToLastNode(SingleNode root, int k) {
		SingleNode first = root;
		SingleNode runner = root;
		if(SingleLinkedListUtil.getlength(first) < k) {
			return null;
		}
		for(int i=1; i<k; i++) {
			first = first.getNext();
		}
		while(first.getNext() != null) {
			first = first.getNext();
			runner = runner.getNext();
		}
		return runner;
	}
	/**
	 * Recursive solution
	 */
	public SingleNode getKthToLastNode1(SingleNode root, int k) {
		SingleNode node = root;
		if(node != null) {
			node = getKthToLastNode1(node.getNext(), k);
			if(++i == k) {
				node = root;
			}
		}
		return node;
	}
}
