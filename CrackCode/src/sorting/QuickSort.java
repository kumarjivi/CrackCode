package sorting;

public class QuickSort {
	
	public static void main(String args[]) {
		int[] input = {3,5,8,1,0,2,7};
		int [] arr = sort(input, 0, 6);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static int[] sort(int[] arr, int low, int high) {
		if(low < high) {
			int partition = partition(arr, low, high - 1);
			sort(arr, low, partition - 1);
			sort(arr, partition + 1, high);
		}
		return arr;
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		while(low < high-1) {
			while(arr[low] < arr[pivot]) {
				low++;
			}
			while(arr[high-1] > arr[pivot] && high > 0) {
				high--;
			}
			if(low >= high-1) {
				break;
			}
			//swap high-1 and low
			int temp = arr[high-1];
			arr[high-1] = arr[low];
			arr[low] = temp;
			
//			arr[high-1] = arr[high-1] * arr[low];
//			arr[low] = arr[high-1]/arr[low];
//			arr[high-1] = arr[high-1]/arr[low];
		}
		//swap high and pivot.
		int temp = arr[high];
		arr[high] = arr[pivot];
		arr[pivot] = temp;
//		arr[pivot] = arr[high] * arr[pivot];
//		arr[high] = arr[pivot]/arr[high];
//		arr[pivot] = arr[pivot]/arr[high];
		return pivot;
	}
	private static void swap (int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}