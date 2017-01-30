package sorting;

public class SelectionSortTest {

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		char[] input = "namaste".toCharArray();
		selectionSort.sort(input);
		for(char c: input) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
}
