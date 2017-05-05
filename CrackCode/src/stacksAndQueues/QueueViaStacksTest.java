package stacksAndQueues;

public class QueueViaStacksTest {

	public static void main(String[] args) {
		QueueViaStacks queue = new QueueViaStacks();
		for (int i=0; i<10; i=i+2) {
			queue.enqueue(i);
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}

}
