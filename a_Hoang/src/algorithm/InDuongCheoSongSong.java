package algorithm;

// in ra đường chéo song song với đường chéo chính ma trận vuông
public class InDuongCheoSongSong {
	public static void print(int matrix[][]) {
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				for (int k = n; k > 0; k--) {
					if (Math.abs(i - j) == k) {
						System.out.print(matrix[i][j] + " ");
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		int matrix[][] = { { 3, 5, 11 }, { 4, 7, 0 }, { 9, 2, 8 } };	         
//		result = 11, 5, 0, 4, 2, 9
		print(matrix);

	}
}
