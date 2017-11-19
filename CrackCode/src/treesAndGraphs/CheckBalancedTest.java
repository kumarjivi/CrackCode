package treesAndGraphs;

public class CheckBalancedTest {

	public static void main(String[] args) {
		BTreeNode five = new BTreeNode(5);
		BTreeNode two = new BTreeNode(2);
		BTreeNode six = new BTreeNode(6);
//		BTreeNode seven = new BTreeNode(7);
//		BTreeNode nine = new BTreeNode(9);
//		BTreeNode three = new BTreeNode(3);
//		BTreeNode four = new BTreeNode(4);
//		BTreeNode one = new BTreeNode(1);
//		BTreeNode zero = new BTreeNode(0);
//		BTreeNode ten = new BTreeNode(10);
//		two.setLeft(seven);
//		two.setRight(nine);
//		six.setLeft(three);
//		six.setRight(four);
//		five.setLeft(two);
//		five.setRight(six);
//		three.setLeft(one);
//		one.setLeft(zero);
//		three.setRight(ten);
		five.setRight(two);
		two.setRight(six);
		CheckBalanced checkBalanced = new CheckBalanced();
		System.out.println(checkBalanced.isBalancedTwo(five));
	}

}
