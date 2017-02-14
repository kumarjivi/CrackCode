package linkedLists;

import java.util.HashSet;
import java.util.Set;

/***
 * Write code to remove duplicates from an unsorted linked list.
 * @author Kumar
 *
 */
public class RemoveDups {
	/**
	 * When using temporary buffer is allowed.
	 * @param root
	 * @return
	 */
	public SingleNode removeDupsWithBuffer(SingleNode root) {
		if(root == null) {
			return root;
		}
		SingleNode rootCopy = root;
		int data = 0;
		Set<Integer> unique = new HashSet<Integer>();
		while(root != null) {
			data = root.getData();
			if(unique.contains(data)) {
				LinkedListOperations.deleteANode(rootCopy, root);
			} else {
				unique.add(data);
			}
			root = root.getNext();
		}
		return rootCopy;
	}
	/**
	 * When using temporary buffer is not allowed
	 * @param root
	 * @return
	 */
	public SingleNode removeDups(SingleNode root) {
		if(root == null) {
			return root;
		}
		SingleNode rootCopy = root;
		SingleNode first = root;
		SingleNode second = root;
		while(first.getNext() != null) {
			second = first;
			while(second.getNext() != null) {
				if(first.getData() == second.getNext().getData()) {
					second.setNext(second.getNext().getNext());
				} else {
					second = second.getNext();
				}
				
			}
			first = first.getNext();
		}
		return rootCopy;
	}
	
}
