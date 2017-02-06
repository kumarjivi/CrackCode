package util;

import treesAndGraphs.BTreeNode;

public class BSTUtil {
	public static void main(String args[]) {
		BTreeNode node1 = new BTreeNode(10);
		BTreeNode node2 = new BTreeNode(20);
		BTreeNode node3 = new BTreeNode(30);
		BTreeNode root = new BTreeNode(40);
		BTreeNode node4 = new BTreeNode(50);
		BTreeNode node5 = new BTreeNode(60);
		BTreeNode node6 = new BTreeNode(70);
		node2.setLeft(node1);
		node2.setRight(node3);
		node5.setLeft(node4);
		node5.setRight(node6);
		root.setLeft(node2);
		root.setRight(node5);
		inOrderTraversal(root);
		int[] arr = new int[7];
		arr = getInOrderAsArray(root, 7);
		for(int i=0; i<7; i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void inOrderTraversal(BTreeNode node) {
		if(node != null) {
			inOrderTraversal(node.getLeft());
			System.out.print(node.getData()+"\t");
			inOrderTraversal(node.getRight());
		}
	}
	
	public static int[] getInOrderAsArray(BTreeNode node, int size) {
		int[] array = new int[size];
		saveInOrderAsArray(node, 0, array);
		return array;
	}
	
	private static void saveInOrderAsArray(BTreeNode node, int index, int[] arr) {
		if(node != null) {
			saveInOrderAsArray(node.getLeft(), index, arr);
			arr[index] = node.getData();
			index++;
//			System.out.print(node.getData()+"\t");
			saveInOrderAsArray(node.getRight(), index, arr);
		}
	}
}
