package Task1;

import java.util.Arrays;

public class Task1_4 {
	// tranpose a matrix
	public static int[][] transpose(int[][] a) {
		int result[][] = new int[a[0].length][a.length];
		for(int i = 0; i < result.length;i++) {
			for(int j = 0; j < result[0].length;j++) {
				result[i][j] = a[j][i];
			}
		}
		return result;
	}
	
	public static void printf(int result[][]) {
		for(int i = 0; i < result.length;i++) {
			for(int j = 0; j < result[0].length;j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int result[][] = transpose(a);	
		printf(result);
//		System.out.print(Arrays.deepToString(result));
	}
	
}
