package treesAndGraphs;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;
import util.BSTUtil;

public class CreateBSTFromArrayTest {
	
//	@Test
//	public void testCreation() {
//		int[] array = {10,20,30,40,50};
//		
//		boolean isSame = Arrays.equals(array, );
//		Assert.assertTrue("true", isSame);
//	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4, 5};
		CreateBSTFromArray createBSTFromArray = new CreateBSTFromArray();
		BTreeNode node = createBSTFromArray.createBST(0, 4, arr);
		BSTUtil.inOrderTraversal(node);
	}

}
