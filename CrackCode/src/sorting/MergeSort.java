package sorting;

/*Merge Sort*/
import java.util.Arrays;
public class MergeSort {

	public static void main(String args[]) {
		int[] in = {2,5,7,1,73,20,04,37,64};
		int[] output = sort(in);
		for(int i=0; i<output.length; i++) {
			System.out.print(output[i]+"\t");
		}
//		int[] a = {7};
//		int[] b = {1};
//		printArray(merge(a,b));
	}
	
	public static int[] sort(int[] input) {
		int r = input.length;
		if(r <= 1) {
			return input;
		}
		int mid = (r)/2;
		int[] leftSub = Arrays.copyOfRange(input, 0, mid);
		int[] rightSub = Arrays.copyOfRange(input, mid, input.length);
		System.out.println("Calling mergeSort on: ");
		printArray(leftSub);
		sort(leftSub);	
		System.out.println("Calling mergeSort on: ");
		printArray(rightSub);
		sort(rightSub);
		System.out.println("Merging");
		printArray(leftSub);
		System.out.println("and");
		printArray(rightSub);
		merge(leftSub, rightSub, input);
		return input;
	}


	public static void merge(int[] arr1, int[] arr2, int[] originalArray) {
//		int[] originalArray = new int[arr1.length + arr2.length];
		int index1 = 0;
		int index2 = 0;
		int mergedIndex = 0;
		while(index1 != arr1.length && index2 != arr2.length) {
			if(arr1[index1] <= arr2[index2]) {
				originalArray[mergedIndex] = arr1[index1];
				index1++;
			} else {
				originalArray[mergedIndex] = arr2[index2];
				index2++;
			}
			mergedIndex++;
		}
		if(index2 < arr2.length) {
			while(index2 < arr2.length) {
				originalArray[mergedIndex] = arr2[index2];
				index2++;
				mergedIndex++;
			}
		}
		if(index1 < arr1.length) {
			while(index1 < arr1.length) {
				originalArray[mergedIndex] = arr1[index1];
				index1++;
				mergedIndex++;
			}
		}
//		return originalArray;
	}
	
	private static void printArray(int[] output) {
		for(int i=0; i<output.length; i++) {
			System.out.print(output[i]+"\t");
		}
		System.out.println();
	}
}