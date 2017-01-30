package arraysAndStrings;

public class RotateMatrix {
	
	public static void rotateMatrix(int[][] arr) {
		int n = arr.length;
		//outer loop to iterate size/2 times.
		for(int layer=0; layer<n/2; layer++) {
			int first = layer;
			int last = n-layer-1;
			
			for(int i=first; i<last; i++) {//for n-1 elements of the layer
				int offset = i-first;
				//store top
				int temp = arr[layer][i];
				//left -> top
				arr[layer][i] = arr[last-offset][layer];
				//bottom -> left
				arr[last-offset][layer] = arr[last][last-offset];
				//right -> bottom
				arr[last][last-offset] = arr[i][last];
				//top -> right
				arr[i][last] = temp;
			}
		}
	}
	
	public static void main(String aregs[]) {
		int[][] input = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25},
		};
		System.out.println("Before:");
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(input[i][j]+"\t");
			}
			System.out.println();
		}
		rotateMatrix(input);
		System.out.println("After:");
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(input[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
