package treesAndGraphs;

import java.util.List;

public class LevelListFromTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelListFromTree levelListFromTree = new LevelListFromTree();
		BTreeNode input = setup();
		List<List<Integer>> result = levelListFromTree.getLevelListFromTree(input);
		for(List<Integer> list : result) {
			for(Integer i : list) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
	}
	
	private static BTreeNode setup() {
		BTreeNode node1 = new BTreeNode(1);
		BTreeNode node4 = new BTreeNode(4);
		BTreeNode node6 = new BTreeNode(6);
		BTreeNode node8 = new BTreeNode(8);
		BTreeNode node2 = new BTreeNode(2);
		BTreeNode node7 = new BTreeNode(7);
		BTreeNode node12 = new BTreeNode(12);
		BTreeNode node18 = new BTreeNode(18);
		BTreeNode node5 = new BTreeNode(5);
		BTreeNode node15 = new BTreeNode(15);
		BTreeNode node10 = new BTreeNode(10);
		node2.setLeft(node1);
		node2.setRight(node4);
		node7.setLeft(node6);
		node7.setRight(node8);
		node5.setLeft(node2);
		node5.setRight(node7);
		node15.setLeft(node12);
		node15.setRight(node18);
		node10.setLeft(node5);
		node10.setRight(node15);
		return node10;
	}

}
