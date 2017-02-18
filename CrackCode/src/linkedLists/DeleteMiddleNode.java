package linkedLists;
/***
 * Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node. Node to be deleted cannot be the last node of the list.
 * @author Kumar
 *
 */
public class DeleteMiddleNode {
	// nodeToDelete should not be the last node of the linkedlist
	public void deleteThisNode(SingleNode nodeToDelete) {
		if(nodeToDelete != null && nodeToDelete.getNext() != null) {
			nodeToDelete.setData(nodeToDelete.getNext().getData());
			nodeToDelete.setNext(nodeToDelete.getNext().getNext());
		}
	}
	
}
