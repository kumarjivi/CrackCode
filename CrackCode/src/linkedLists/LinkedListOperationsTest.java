package linkedLists;

import util.SingleLinkedListUtil;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LinkedListOperationsTest {

	@Test
	public void testInsertionAtEnd() {
		LinkedListOperations operations = new LinkedListOperations();
		SingleNode head = new SingleNode(1,null);
		SingleNode node = new SingleNode(2, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(3, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(4, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(5, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(6, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(7, null);
		operations.insertNode(head, node, 10);
		assertEquals(7, SingleLinkedListUtil.getlength(head));
	}

	@Test
	public void testInsertionAtStart() {
		LinkedListOperations operations = new LinkedListOperations();
		SingleNode head = new SingleNode(1,null);
		SingleNode node = new SingleNode(2, null);
		head = operations.insertNode(head, node, 0);
		node = new SingleNode(3, null);
		head = operations.insertNode(head, node, 0);
		node = new SingleNode(4, null);
		head = operations.insertNode(head, node, 0);
		node = new SingleNode(5, null);
		head = operations.insertNode(head, node, 0);
		node = new SingleNode(6, null);
		head = operations.insertNode(head, node, 0);
		assertEquals(6, SingleLinkedListUtil.getlength(head));
	}

	@Test
	public void testInsertion() {
		LinkedListOperations operations = new LinkedListOperations();
		SingleNode head = new SingleNode(1,null);
		SingleNode node = new SingleNode(2, null);
		head = operations.insertNode(head, node, 1);
		node = new SingleNode(3, null);
		head = operations.insertNode(head, node, 2);
		node = new SingleNode(5, null);
		head = operations.insertNode(head, node, 3);
		node = new SingleNode(4, null);
		head = operations.insertNode(head, node, 3);
		node = new SingleNode(6, null);
		head = operations.insertNode(head, node, 10);
		assertEquals(6, SingleLinkedListUtil.getlength(head));
	}
}
