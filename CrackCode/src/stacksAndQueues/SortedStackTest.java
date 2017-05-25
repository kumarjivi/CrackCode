package stacksAndQueues;

public class SortedStackTest {

	public static void main(String[] args) {
		SortStack test = new SortStack();
		Stack testStack = new Stack();
		testStack.push(6);
		testStack.push(4);
		testStack.push(10);
		testStack.push(2);
		testStack.push(12);
		testStack.push(1);
		test.sort(testStack);
		while(!testStack.isEmpty()) {
			System.out.println(testStack.pop());
		}
	}

}
