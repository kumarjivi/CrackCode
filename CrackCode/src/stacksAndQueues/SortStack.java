package stacksAndQueues;
/***
 * Write a program to sort a stack in ascending order (with biggest items on top).
 * You may use at most one additional stack to hold items, but you may not copy
 * the elements into any other data structure (such as an array). The stack supports
 * the following operations: push, pop, peek, and isEmpty.
 * 
 * @author Kumar
 * 
 */
public class SortStack {

	
	public void sort(Stack primary) {
		int count = 0;
		Stack sec = new Stack();
		int max = Integer.MAX_VALUE;
		int top = max;
		if(primary == null) {
			return;
		}
		while(!primary.isEmpty()) {
			int temp = primary.pop();
			//if temp is minimum so far, push it (it should be on the top of sec stack).
			if(temp < max && temp < top) {
				sec.push(temp);
				top = temp;
				if(max == Integer.MAX_VALUE) {
					max = temp;
				}
			} else { //find the correct spot for temp so that the sec stack is sorted.
				while(!sec.isEmpty() && sec.peek() <= temp) {
					primary.push(sec.pop());
					count++;
				}
				sec.push(temp);
				if(temp > max) {
					max = temp;
				}
				while(count > 0) {
					sec.push(primary.pop());
					count--;
				}
			}
		}
		while(!sec.isEmpty()) {
			primary.push(sec.pop());
		}
	}
}
