package TH2;

import java.util.Arrays;

public class Task1_3 {

	// This method is used to display a Pascal triangle based on the parameter n.

	// Where n represents the number of rows
	public static void printPascalTriangle(int row) {
		for (int i = 0; i < row; i++) {
//			sử dụng đệ quy
			System.out.println( "\t" + Arrays.toString(getPascalTriangle(i)) + "\t"); 
			
		}
		// TODO
	}

	// get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n) {
		// TODO
		if (n <= 1) {
			return new int[] { 1 };
		} else {
			int[] prevRow = getPascalTriangle(n - 1);
			return generateNextRow(prevRow);
		}
	}

	// generate the next row based on the previous row
	// Ex. prevRow = {1} ==> nextRow = {1, 1}
	// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
	public static int[] generateNextRow(int[] prevRow) {
		int result[] = new int[prevRow.length + 1];
		for (int i = 1; i <= prevRow.length - 1; i++) {
			result[i] = prevRow[i - 1] + prevRow[i];
		}
		result[0] = 1;
		result[prevRow.length] = 1;
		return result;
	}

	public static void main(String[] args) {
		int[] prevRow = { 1, 2, 1 };
//		System.out.println(Arrays.toString(getPascalTriangle(4)));
//		System.out.println(Arrays.toString(generateNextRow(prevRow)));
		printPascalTriangle(5);
	}

}
