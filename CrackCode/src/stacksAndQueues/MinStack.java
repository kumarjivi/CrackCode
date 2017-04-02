package stacksAndQueues;
/**
 * April 2, 2017.
 * Design a stack which, in addition to push and pop, also has a
 * function min which returns the minimum element? Push, pop and min should
 * all operate in O(1) time.
 * @author Kumar
 *
 */
public class MinStack extends Stack {
	Stack minStack = new Stack();
	Stack dataStack = new Stack();
	
	public boolean push(int value) {
		if(minStack.getSize() == 0) {
			minStack.push(value);
		}
		dataStack.push(value);
		if(minStack.peek() > value) {
			minStack.push(value);
		}
		return true;
	}
	
	public Integer pop() {
		if(dataStack.getSize() < 0) {
			return null;
		}
		Integer value = dataStack.pop();
		if(value == minStack.peek()) {
			minStack.pop();
		}
		return value;
	}
	
	public Integer min() {
		if(minStack.getSize() <= 0) {
			return null;
		} else {
			return minStack.peek();
		}
	}
	
	public int getSize() {
		return dataStack.getSize();
	}
}
