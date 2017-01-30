package util;

import linkedLists.SingleNode;

public class SingleLinkedListUtilTest {

	public static void main(String[] args) {
		SingleNode node6 = new SingleNode(6, null);
		SingleNode node5 = new SingleNode(5, node6);
		SingleNode node4 = new SingleNode(4, node5);
		SingleNode node3 = new SingleNode(3, node4);
		SingleNode node2 = new SingleNode(2, node3);
		SingleNode node = new SingleNode(1, node2);
		SingleLinkedListUtil.printList(node);
		System.out.println(SingleLinkedListUtil.getlength(node));
	}

}
