package medium;

// https://leetcode.com/problems/maximal-square/description/
public class _221_maximalSquare {
	public static int maximalSquare(char[][] matrix) {
		int maxSquare = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		return maxSquare;

	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 } };
		
	}
}
