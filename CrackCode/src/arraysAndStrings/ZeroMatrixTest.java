package arraysAndStrings;

public class ZeroMatrixTest {

	public static void main(String[] args) {
		ZeroMatrix zeroMatrix = new ZeroMatrix();
		int[][] input = {
				{1,2,3,4,5},
				{6,4,7,8,9},
				{4,2,4,0,7},
				{1,1,1,1,1},
		};
//		int[][] solution = zeroMatrix.getZeroedMatrix1(input, 4, 5);
		int[][] solution = zeroMatrix.getZeroedMatrix2(input, 4, 5);
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(solution[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
