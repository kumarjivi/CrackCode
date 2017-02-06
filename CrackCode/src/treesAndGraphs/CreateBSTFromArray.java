package treesAndGraphs;
/***
 * Given a sorted (increasing order) array with unique integer elements, write an
 * algorithm to create a binary search tree with minimal height.
 * @author Kumar
 *
 */
public class CreateBSTFromArray {
	public BTreeNode createBST(int start,int end, int[] arr) {
		if(start == end) {
			return new BTreeNode(arr[start]);
		} else if(start > end) {
			return null;
		} else {
			int mid = (start + end)/2;
			BTreeNode node = new BTreeNode(arr[mid]);
			node.setLeft(createBST(start, mid-1, arr));
			node.setRight(createBST(mid+1, end, arr));
			return node;
		}
	}
}
