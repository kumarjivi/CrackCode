package treesAndGraphs;

public class ValidateBSTTest {

	public static void main(String[] args) {
		BTreeNode ten = new BTreeNode(10);
		BTreeNode twenty = new BTreeNode(20);
		BTreeNode thirty = new BTreeNode(30);//
		BTreeNode forty = new BTreeNode(40);
		BTreeNode fifty = new BTreeNode(50);
		BTreeNode sixty = new BTreeNode(60);
		BTreeNode seventy = new BTreeNode(70);
		BTreeNode eighty = new BTreeNode(80);
		BTreeNode ninty = new BTreeNode(90);
		BTreeNode hund = new BTreeNode(100);
		BTreeNode hunTen = new BTreeNode(110);
		forty.setLeft(thirty);
		forty.setRight(fifty);
		eighty.setLeft(seventy);
		eighty.setRight(ninty);
		twenty.setLeft(ten);
		twenty.setRight(forty);
		hund.setLeft(eighty);
		hund.setRight(hunTen);
		sixty.setLeft(twenty);
		sixty.setRight(hund);
		ValidateBST validateBST = new ValidateBST();
		System.out.println(validateBST.isValidBST(sixty));
	}

}
