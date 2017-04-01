package linkedLists;

import util.SingleLinkedListUtil;

public class LoopDetectionTest {

	public static void main(String[] args) {
		SingleNode one = new SingleNode(1);
		SingleNode two = new SingleNode(2);
		SingleNode three = new SingleNode(3);
		SingleNode four = new SingleNode(4);
		SingleNode five = new SingleNode(5);
		SingleNode six = new SingleNode(6);
		SingleNode seven = new SingleNode(7);
		SingleNode eight = new SingleNode(8);
		one.setNext(two);
		two.setNext(three);
		three.setNext(four);
		four.setNext(five);
		five.setNext(six);
		six.setNext(seven);
		seven.setNext(eight);
//		eight.setNext(three);
		eight.setNext(four);
		LoopDetection detection = new LoopDetection();
		SingleNode result = detection.getLoopStart(one);
		System.out.println("First node of the loop is: "+result.getData());
	}

}
