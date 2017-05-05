package stacksAndQueues;

public class QueueViaStacksTest {

	public static void main(String[] args) {
		QueueViaStacks queue = new QueueViaStacks();
		queue.enqueue(3);
		System.out.println(queue.dequeue());
		queue.enqueue(5);
		queue.enqueue(8);
		queue.enqueue(23);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		for (int i=0; i<10; i=i+2) {
			queue.enqueue(i);
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}

}
