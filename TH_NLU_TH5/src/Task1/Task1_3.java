package Task1;

public class Task1_3 {
	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
		int result[][] = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}

			}
		}

		return result;
	}

	public static void printf(int result[][]) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int b[][] = { { -2, -6, 9 }, { 1, 0, 5 }, { 8, -3, 2 }, { -3, 4, 6 } };
		int result[][] = multiply(a, b);
		printf(result);
	}
}
