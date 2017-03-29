package linkedLists;
/***
 * Write code to partition a linked list around a value x, such that all nodes less than
 * x come before all nodes greater than or equal to x.
 * @author Kumar
 *
 */
public class Partition {
	//without maintaining the relative order of elements.
	public SingleNode getPartitionedList(SingleNode head, int partitionValue) {
		SingleNode headCopy = head;
		LinkedListOperations operation = new LinkedListOperations();
		SingleNode temp = null;
		SingleNode pos = null;
		boolean firstMove = false;
		while(headCopy != null) {
			//delete current Node.
			temp = headCopy;
			headCopy = headCopy.getNext();
			if(temp.getData() < partitionValue) {
				if(!firstMove) {
					firstMove = true;
					pos = temp;
				}
				//insert the node at start.
				head = LinkedListOperations.deleteANode(head, temp);
				head = LinkedListOperations.insertAtStart(head, temp);
			} else if(temp.getData() == partitionValue) {
				head = LinkedListOperations.deleteANode(head, temp);
				if(!firstMove) {
					head = LinkedListOperations.insertAtStart(head, temp);
				} else {
					head = LinkedListOperations.insertAfter(head, temp, pos);
				}
			}
		}
		return head;
	}
	
	//maintaining the relative order of the elements.
	public SingleNode getPartitionedList1(SingleNode head, int partitionValue) {
		SingleNode headCopy = head;
		LinkedListOperations operation = new LinkedListOperations();
		SingleNode temp = null;
		SingleNode pos = null;
		boolean firstMove = false;
		while(headCopy != null) {
			//delete current Node.
			temp = headCopy;
			headCopy = headCopy.getNext();
			
			if(temp.getData() < partitionValue) {
				head = LinkedListOperations.deleteANode(head, temp);
				if(!firstMove) {
					firstMove = true;
					pos = temp;
					head = LinkedListOperations.insertAtStart(head, temp);
				} else {
					head = LinkedListOperations.insertAfter(head, temp, pos);
					pos = pos.getNext();
				}
			} else if(temp.getData() == partitionValue) {
				head = LinkedListOperations.deleteANode(head, temp);
				if(!firstMove) {
					head = LinkedListOperations.insertAtStart(head, temp);
				} else {
					head = LinkedListOperations.insertAfter(head, temp, pos);
				}
			}
		}
		return head;
	}
}
