package Task1;

import java.util.Arrays;

public class Task1_1 {
	// add 2 matrices
	public static int[][] add(int[][] a, int[][] b) {
		int result[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
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
		int a[][] = { { 7, 2 }, { 5, 3 } };
		int b[][] = { { 2, 1 }, { 3, 1 } };
		int c[][] = {{1,2,3}, {4, 5, 6}};
		int d[][] = {{7,8,9}, {10, 11, 12}};
		int result[][] = add(c, d);
//		System.out.println(Arrays.deepToString(add(a, b)));
		printf(result);
	}
}
