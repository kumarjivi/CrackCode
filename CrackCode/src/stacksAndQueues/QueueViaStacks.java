package stacksAndQueues;
/***
 * Implement a QueueViaStacks class which implements queue using two Stacks. 
 * @author Kumar
 *
 */

public class QueueViaStacks {
	private Stack primary;
	private Stack secondary;
	private boolean lastActionPop;
	
	public QueueViaStacks() {
		primary = new Stack();
		secondary = new Stack();
		lastActionPop = false;
	}
	
	public boolean enqueue(int value) {
		if(lastActionPop) {
			System.out.println("In enqueue loop for value: "+value);
			while(!secondary.isEmpty()) {
				primary.push(secondary.pop());
			}
			lastActionPop = false;
		}
		return primary.push(value);
	}
	
	public Integer dequeue() {
		if(primary.isEmpty() && secondary.isEmpty()) {
			return null;
		}
		if(!lastActionPop) {
			while(!primary.isEmpty()) {
				secondary.push(primary.pop());
			}
			lastActionPop = true;
			System.out.println("In dequeue loop for: "+secondary.peek());
		}
		return secondary.pop();
	}
	
	public boolean isEmpty() {
		return primary.isEmpty() && secondary.isEmpty();
	}
	
	public int getSize() {
		return primary.getSize() + secondary.getSize();
	}
}
