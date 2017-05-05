package stacksAndQueues;
/***
 * Implement a QueueViaStacks class which implements queue using two Stacks. 
 * @author Kumar
 *
 */

public class QueueViaStacks {
	Stack primary;
	Stack secondary;
	
	public QueueViaStacks() {
		primary = new Stack();
		secondary = new Stack();
	}
	
	public boolean enqueue(int value) {
		return primary.push(value);
	}
	
	public Integer dequeue() {
		if(primary.isEmpty()) {
			return null;
		}
		while(!primary.isEmpty()) {
			secondary.push(primary.pop());
		}
		int val = secondary.pop();
		while(!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}
		return val;
	}
	
	public boolean isEmpty() {
		return primary.isEmpty();
	}
	
	public int getSize() {
		return primary.getSize();
	}
}
