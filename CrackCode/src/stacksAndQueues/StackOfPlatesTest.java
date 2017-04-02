package stacksAndQueues;

public class StackOfPlatesTest {

	public static void main(String[] args) {
		int thres = 4;
		StackOfPlates stack = new StackOfPlates(thres);
		System.out.println("Stack of plates with each stack having capacity: "+thres);
		System.out.println("Inserted elements 1 through 15.");
		for(int i=1; i<=15; i++) {
			stack.push(i);
		}
		System.out.println("popping 1 element from each sub-Stack.");
		for(int i=3; i>=0; i--) {
			stack.popAt(i);
		}
		System.out.println("Popping elements 1-by-1.");
		Integer val = stack.pop();
		while(val != null) {
			System.out.println(val);
			val = stack.pop();
		}
	}

}
