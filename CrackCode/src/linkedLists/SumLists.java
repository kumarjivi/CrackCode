package linkedLists;

public class SumLists {
	
	private SingleNode getSumReverse(SingleNode small, SingleNode big) {
		SingleNode smallCopy = small;
		SingleNode bigCopy = big;
		int carry = 0, sum = 0;
		while(smallCopy != null && bigCopy != null) {
			sum = smallCopy.getData() + bigCopy.getData() + carry;
			if(sum > 9) {
				carry = 1;
				sum = sum - 10;
			}
			bigCopy.setData(sum);
			smallCopy = smallCopy.getNext();
			bigCopy = bigCopy.getNext();
		}
		sum = 0;
		while(bigCopy != null) {
			sum = bigCopy.getData() + carry;
			if(sum > 9) {
				carry = 1;
				sum = sum - 10;
			}
			bigCopy.setData(sum);
			bigCopy = bigCopy.getNext();
		}
		if(carry == 1) {
			LinkedListOperations.insertAtEnd(big, carry);
		}
		return big;
	}
	
	public SingleNode getSumListReverse(SingleNode headOne, SingleNode headTwo) {
		int len1=0, len2 = 0;
		SingleNode headOneCopy = headOne;
		SingleNode headTwoCopy = headTwo;
		while(headOneCopy != null) {
			len1++;
			headOneCopy = headOneCopy.getNext();
		}
		while(headTwoCopy != null) {
			len2++;
			headTwoCopy = headTwoCopy.getNext();
		}
		if(len1 < len2) {
			return getSumReverse(headOne, headTwo);
		} else {
			return getSumReverse(headTwo, headOne);
		}
	}

} 
