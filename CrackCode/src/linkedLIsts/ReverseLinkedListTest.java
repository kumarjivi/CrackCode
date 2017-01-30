package linkedLIsts;

public class ReverseLinkedListTest {

	public static void main(String[] args) {
		SingleNode seven = new SingleNode(7, null);
		SingleNode six = new SingleNode(6, seven);
		SingleNode five = new SingleNode(5, six);
		SingleNode four = new SingleNode(4, five);
		SingleNode three = new SingleNode(3, four);
		SingleNode two = new SingleNode(2, three);
		SingleNode one = new SingleNode(1, two);
		SingleNode zero = new SingleNode(0, one);
		
		
		ReverseLinkedList list = new ReverseLinkedList();
		SingleNode result = list.getReverseList(zero);
		printList(result);
		
	}

	public static void printList(SingleNode singleNode) {
		System.out.println("printing start");
		while(singleNode != null) {
			System.out.println("in loop");
			System.out.print(singleNode.getData());
			singleNode = singleNode.getNext();
		}
	}
}
