package stacksAndQueues;

import java.util.ArrayList;
import java.util.List;

/**
 * April 2, 2017.
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack
 * exceeds some threshold. Implement a data structure SetOf Stacks that mimics
 * this. SetOf Stacks should be composed of several stacks and should create a
 * new stack once the previous one exceeds capacity. SetOf Stacks. push() and
 * SetOf Stacks. pop() should behave identically to a single stack (that is, popO
 * should return the same values as it would if there were just a single stack).
 * 
 * @author Kumar
 *
 */
public class StackOfPlates {
	private List<Stack> stackList;
	private int threshold;
	private int currIndex;
	
	public StackOfPlates(int thres) {
		stackList = new ArrayList<Stack>();
		threshold = thres;
		currIndex = 0;
	}
	
	public StackOfPlates() {
		//if not specified, default threshold is 7
		this.threshold = 7;
	}
	
	public boolean push(int value) {
		if(stackList.isEmpty()) {
			stackList.add(new Stack());
		}
		if(stackList.get(currIndex).getSize() >= threshold) {
			stackList.add(new Stack());
			currIndex++;
		}
		stackList.get(currIndex).push(value);
		return true;
	}
	
	public Integer pop() {
		if(currIndex < 0) {
			return null;
		}
		Integer value = stackList.get(currIndex).pop();
		if(stackList.get(currIndex).getSize() == 0) {
			stackList.remove(currIndex);
			currIndex--;
		}
		return value;
	}
	/*
	 * Implement a function popAt(int index) which performs a pop operation on
	 * a specific sub-stack. sub-stack starts from zero.
	 */
	public Integer popAt(int subStack) {
		if(subStack > currIndex || subStack < 0) {
			return null;
		}
		return stackList.get(subStack).pop();
	}
	
}
