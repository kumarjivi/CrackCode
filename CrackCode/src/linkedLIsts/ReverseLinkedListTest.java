package linkedLIsts;

public class ReverseLinkedListTest {

	public static void main(String[] args) {
		Node seven = new Node(7, null);
		Node six = new Node(6, seven);
		Node five = new Node(5, six);
		Node four = new Node(4, five);
		Node three = new Node(3, four);
		Node two = new Node(2, three);
		Node one = new Node(1, two);
		Node zero = new Node(0, one);
		
		
		ReverseLinkedList list = new ReverseLinkedList();
		Node result = list.getReverseList(zero);
		printList(result);
		
	}

	public static void printList(Node node) {
		System.out.println("printing start");
		while(node != null) {
			System.out.println("in loop");
			System.out.print(node.getData());
			node = node.getNext();
		}
	}
}
