package sorting;

public class InsertionSortTest {

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		char[] input = "hello".toCharArray();
		insertionSort.sort(input);
		for(char c: input) {
			System.out.print(c+" ");
		}
		System.out.println();
	}

}
