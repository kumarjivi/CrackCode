package treesAndGraphs;

public class SuccessorBSTNodeTest {
	
	public static void main(String args[]) {

		BTreeNodeWithParent node1 = new BTreeNodeWithParent(1);
		BTreeNodeWithParent node2 = new BTreeNodeWithParent(2);
		BTreeNodeWithParent node3 = new BTreeNodeWithParent(3);
		BTreeNodeWithParent node4 = new BTreeNodeWithParent(4);
		BTreeNodeWithParent node5 = new BTreeNodeWithParent(5);
		BTreeNodeWithParent node6 = new BTreeNodeWithParent(6);
		BTreeNodeWithParent node7 = new BTreeNodeWithParent(7);
		BTreeNodeWithParent node8 = new BTreeNodeWithParent(8);
		BTreeNodeWithParent node9 = new BTreeNodeWithParent(9);
		BTreeNodeWithParent node10 = new BTreeNodeWithParent(10);
		BTreeNodeWithParent node13 = new BTreeNodeWithParent(13);
		BTreeNodeWithParent node16 = new BTreeNodeWithParent(16);
		
		BTreeNodeWithParent node26 = new BTreeNodeWithParent(26);
		BTreeNodeWithParent node29 = new BTreeNodeWithParent(29);
		node8.setRight(node9);
		node9.setParent(node8);
		node3.setLeft(node1);
		node1.setParent(node3);
		node3.setRight(node4);
		node4.setParent(node3);
		node7.setLeft(node6);
		node6.setParent(node7);
		node7.setRight(node8);
		node8.setParent(node7);
		node5.setLeft(node3);
		node3.setParent(node5);
		node5.setRight(node7);
		node7.setParent(node5);
		node26.setRight(node29);
		node29.setParent(node26);
		node16.setRight(node26);
		node26.setParent(node16);
		node16.setLeft(node13);
		node13.setParent(node16);
		node10.setLeft(node5);
		node5.setParent(node10);
		node10.setRight(node16);
		node16.setParent(node10);
	
		SuccessorBSTNode successorBSTNode = new SuccessorBSTNode();
		BTreeNodeWithParent successor = successorBSTNode.getSuccessor(node29);
		if(successor != null) {
			System.out.println(successor.getData());
		} else {
			System.out.println("null");
		}
		
		
	}
}

