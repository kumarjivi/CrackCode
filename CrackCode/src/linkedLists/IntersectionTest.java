package linkedLists;

import util.SingleLinkedListUtil;

public class IntersectionTest {

	public static void main(String[] args) {
		//First linkedList [1,2,3,4,5]
		SingleNode rootOne = new SingleNode(1);
		SingleNode two = new SingleNode(2);
		SingleNode common = new SingleNode(3);
		SingleNode four = new SingleNode(4);
		SingleNode five = new SingleNode(5);
		rootOne.setNext(two);
		two.setNext(common);
		common.setNext(four);
		four.setNext(five);
		
		//Second linkedList [-1,0,1,2,3,4,5]
		//3 being the intersection point.
//		SingleNode rootTwo = new SingleNode(-1);
//		SingleNode zeroCopy = new SingleNode(0);
		SingleNode oneCopy = new SingleNode(1);
		SingleNode twoCopy = new SingleNode(2);
		
//		rootTwo.setNext(zeroCopy);
//		zeroCopy.setNext(oneCopy);
		oneCopy.setNext(twoCopy);
		twoCopy.setNext(common);
		
		System.out.println("ListOne");
		SingleLinkedListUtil.printList(rootOne);
		System.out.println("ListTwo");
//		SingleLinkedListUtil.printList(rootTwo);
		SingleLinkedListUtil.printList(oneCopy);
		Intersection intersection = new Intersection();
//		SingleNode result = intersection.getIntersectionPoint(rootOne, rootTwo);
		SingleNode result = intersection.getIntersectionPoint(rootOne, oneCopy);
		if(result != null) {
			System.out.println("Value of first common node:"+result.getData());
		}
	}

}
