package stacksAndQueues;

public class MinStackTest {

	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(5);
		System.out.println("pushed 5.");
		System.out.println("Size of Stack: "+stack.getSize());
		System.out.println("Min: "+stack.min());
		stack.push(4);
		System.out.println("pushed 4.");
		System.out.println("Size of Stack: "+stack.getSize());
		System.out.println("Min: "+stack.min());
		stack.push(8);
		System.out.println("pushed 8.");
		System.out.println("Size of Stack: "+stack.getSize());
		System.out.println("Min: "+stack.min());
		stack.push(2);
		System.out.println("pushed 2.");
		System.out.println("Size of Stack: "+stack.getSize());
		System.out.println("Min: "+stack.min());
		stack.push(10);
		System.out.println("pushed 10.");
		System.out.println("Size of Stack: "+stack.getSize());
		System.out.println("Min: "+stack.min());
		stack.push(1);
		System.out.println("pushed 1.");
		System.out.println("Size of Stack: "+stack.getSize());
		System.out.println("Min: "+stack.min());
	}

}
