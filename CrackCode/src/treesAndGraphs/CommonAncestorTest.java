package treesAndGraphs;

public class CommonAncestorTest {

	public static void main(String[] args) {
		BTreeNode node1 = new BTreeNode(1);
		BTreeNode node2 = new BTreeNode(2);
		BTreeNode node3 = new BTreeNode(3);
		BTreeNode node4 = new BTreeNode(4);
		BTreeNode node5 = new BTreeNode(5);
		BTreeNode node6 = new BTreeNode(6);
		BTreeNode node7 = new BTreeNode(7);
		BTreeNode node8 = new BTreeNode(8);
		BTreeNode node9 = new BTreeNode(9);
		BTreeNode node10 = new BTreeNode(10);
		BTreeNode node13 = new BTreeNode(13);
		BTreeNode node16 = new BTreeNode(16);
		
		BTreeNode node26 = new BTreeNode(26);
		BTreeNode node29 = new BTreeNode(29);
		node8.setRight(node9);
//		node9.setParent(node8);
		node3.setLeft(node1);
//		node1.setParent(node3);
		node3.setRight(node4);
//		node4.setParent(node3);
		node7.setLeft(node6);
//		node6.setParent(node7);
		node7.setRight(node8);
//		node8.setParent(node7);
		node5.setLeft(node3);
//		node3.setParent(node5);
		node5.setRight(node7);
//		node7.setParent(node5);
		node26.setRight(node29);
//		node29.setParent(node26);
		node16.setRight(node26);
//		node26.setParent(node16);
		node16.setLeft(node13);
//		node13.setParent(node16);
		node10.setLeft(node5);
//		node5.setParent(node10);
		node10.setRight(node16);
//		node16.setParent(node10);
		
		CommonAncestor commonAncestor = new CommonAncestor();
//		BTreeNodeWithParent node = commonAncestor.getCommonAncestor(node29, node13);
//		System.out.println(node.getData());
//		System.out.println(commonAncestor.containsNode(node5, null));
		BTreeNode node = commonAncestor.getCommonAncestor(node4, node29, node10);
		if(node != null) {
			System.out.println(node.getData());
		} else {
			System.out.println("null");
		}
		
	}

}
