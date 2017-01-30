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
	
	@Test
	public void testDeletionAtEnd() {
		LinkedListOperations operations = new LinkedListOperations();
		SingleNode head = new SingleNode(1, null);
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
		head = operations.deleteLastNode(head);
		String content = SingleLinkedListUtil.getListDataWithoutSpace(head);
		assertEquals("123456", content);
		head = operations.deleteLastNode(head);
		content = SingleLinkedListUtil.getListDataWithoutSpace(head);
		assertEquals("12345", content);
	}
	
	@Test
	public void testDeletionOfANode() {
		LinkedListOperations operations = new LinkedListOperations();
		SingleNode head = new SingleNode(1, null);
		SingleNode node = new SingleNode(2, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(3, null);
		operations.insertNode(head, node, 10);
		SingleNode node4 = new SingleNode(4, null);
		operations.insertNode(head, node4, 10);
		node = new SingleNode(5, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(6, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(7, null);
		operations.insertNode(head, node, 10);
		head = operations.deleteANode(head, node4);
		String content = SingleLinkedListUtil.getListDataWithoutSpace(head);
		assertEquals("123567", content);
	}
	
	@Test
	public void testDeletionByPosition() {
		LinkedListOperations operations = new LinkedListOperations();
		SingleNode head = new SingleNode(1, null);
		SingleNode node = new SingleNode(2, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(3, null);
		operations.insertNode(head, node, 10);
		SingleNode node4 = new SingleNode(4, null);
		operations.insertNode(head, node4, 10);
		node = new SingleNode(5, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(6, null);
		operations.insertNode(head, node, 10);
		node = new SingleNode(7, null);
		operations.insertNode(head, node, 10);
		head = operations.deleteNodeByPosition(head, 3);
		String content = SingleLinkedListUtil.getListDataWithoutSpace(head);
		assertEquals("124567", content);
	}
	
}
