package linkedLists;
/***
 * March 31, 2017.
 * Write a program to check if two linkedLists intersect,
 * if yes return the point of intersection(node), else return null.
 * @author Kumar
 *
 */
public class Intersection {
	public SingleNode getIntersectionPoint(SingleNode rootOne, SingleNode rootTwo) {
		//Find the length of both the linkedLists.
		SingleNode rootOneCopy = rootOne;
		SingleNode rootTwoCopy = rootTwo;
		int len1=0, len2=0;
		int diff = 0;
		while(rootOneCopy != null) {
			rootOneCopy = rootOneCopy.getNext();
			len1++;
		}
		while(rootTwoCopy != null) {
			rootTwoCopy = rootTwoCopy.getNext();
			len2++;
		}
		rootOneCopy = rootOne;
		rootTwoCopy = rootTwo;
		diff = Math.abs(len1-len2);
		if(len1 < len2) {
			return intersectionHelper(rootOneCopy, rootTwoCopy, diff);
		} else {
			return intersectionHelper(rootTwoCopy, rootOneCopy, diff);
		}
	}
	
	private SingleNode intersectionHelper(SingleNode shorter, SingleNode longer, int diff) {
		SingleNode res = null;
		while(diff != 0) {
			longer = longer.getNext();
			diff--;
		}
		while(shorter != null) {
			if(shorter == longer) {
				return shorter;
			} else {
				shorter = shorter.getNext();
				longer = longer.getNext();
			}
		}
		return res;
	}
}
