package arraysAndStrings;
/***
 * 
 * @author Kumar
 * Write an algorithm such that if an element in a MxN matrix is zero, it's entire 
 * row and column are set to 0.
 */
public class ZeroMatrix {
	
	/**
	 * using dedicated arrays to mark zero rows and columns.
	 * And then iterating original array and making rows and columns as zero.
	 * @param input-input matrix
	 * @param rows- number of rows in input matrix
	 * @param cols- number of columns in input matrix
	 * @return zeroed Matrix.
	 */
	public int[][] getZeroedMatrix1(int[][] input, int rows, int cols) {
		int[][] zeroed = input;
		int[] zeroRow = new int[rows];
		int[] zeroCol = new int[cols];
		for(int i=0;i<rows;i++) {
			zeroRow[i] = -1;
		}
		for(int i=0;i<cols;i++) {
			zeroCol[i] = -1;
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(input[i][j] == 0) {
					zeroRow[i] = 0;
					zeroCol[j] = 0;
				}
			}
		}
		for(int i=0;i<rows;i++) {
			if(zeroRow[i] == 0) {//mark all columns of this row as zero.
				for(int j=0;j<cols;j++) {
					input[i][j] = 0;
				}
			}
		}
		for(int i=0;i<cols;i++) {
			if(zeroCol[i] == 0) {//mark all rows for this column as zero.
				for(int j=0;j<rows;j++) {
					input[j][i] = 0;
				}
			}
		}
		return zeroed;
	}
	/**
	 * use the first row and first column to mark the zero-rows and zero-columns
	 * @param input
	 * @param rows
	 * @param cols
	 * @return
	 */
	public int[][] getZeroedMatrix2(int[][] input, int rows, int cols) {
		int[][] zeroedMatrix = input;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(input[i][j] == 0) {
					//mark j-th col as zero.
					zeroedMatrix[0][j] = 0;
					//mark i-th row as zero.
					zeroedMatrix[i][0] = 0;
				}
			}
		}
		//mark columns as zero. 
		for(int i=0; i<cols; i++) {
			if(zeroedMatrix[0][i] == 0) {
				for(int k=0; k<rows; k++) {
					zeroedMatrix[k][i] = 0;
				}
			}
		}
		//mark rows as zero.
		for(int i=0; i<rows; i++) {
			if(zeroedMatrix[i][0] == 0) {
				for(int j=0; j<cols; j++) {
					zeroedMatrix[i][j] = 0;
				}
			}
		}
		return zeroedMatrix;
	}
}
