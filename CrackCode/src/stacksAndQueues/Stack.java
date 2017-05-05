package stacksAndQueues;

import java.util.ArrayList;
import java.util.List;

/**
 * April 1, 2017
 * List implementation of Stack(of integers).
 * @author Kumar
 *
 */
public class Stack {
	private List<Integer> list;
	private int size;
	private int top;
	
	public Stack() {
		list = new ArrayList<Integer>();
		size = 0;
		top = -1;
	}
	
	public boolean push(Integer value) {
		this.top++;
		this.size++;
		list.add(value);
		return true;
	}
	
	public Integer pop() {
		if(top < 0) {
			return null; 
		}
		Integer value = list.get(top);
		list.remove(top);
		this.top--;
		this.size--;
		return value;
	}
	
	public Integer peek() {
		if(this.size > 0) {
			return list.get(top);
		}
		return null;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
}
