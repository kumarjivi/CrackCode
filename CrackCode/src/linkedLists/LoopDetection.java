package linkedLists;
/***
 * March 31, 2017.
 * Given a LinkedList containing loop. find the first element of the loop.
 * @author Kumar
 *
 */
public class LoopDetection {
	public SingleNode getLoopStart(SingleNode root) {
		if(root == null) {
			return null;
		}
		boolean isLoopPresent = false;
		SingleNode tortoise = root;
		SingleNode hare = root;
		while(hare != null && hare.getNext() != null) {
			tortoise = tortoise.getNext();
			hare = hare.getNext().getNext();
			if(tortoise == hare) {
				isLoopPresent = true;
				break;
			}
		}
		if(!isLoopPresent) {
			return null;
		}
		//move hare to root and move hare and tortoise both 1-step at a time.
		hare = root;
		while(hare != tortoise) {
			hare = hare.getNext();
			tortoise = tortoise.getNext();
		}
		return tortoise;
	}
	
}
