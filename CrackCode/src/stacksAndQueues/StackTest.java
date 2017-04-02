package stacksAndQueues;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		for(int i=1; i<=15; i++) {
			System.out.println("Pushing "+i+" into Stack.");
			stack.push(i);
		}
		for(int i=1; i<=15; i++) {
			System.out.println("Removing: "+stack.peek());
			stack.pop();
		}
	}

}
