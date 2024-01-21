package algorithm;

import java.util.HashMap;
import java.util.Map;

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
		
		Map<Point, Integer> map = new HashMap<>();
		map.put(new Point(1, 1), 100);
		map.put(new Point(2, 2), 100);
		map.put(new Point(2, 2), 200);
		System.out.println(map.size());
//		int matrix[][] = { { 3, 5, 11 }, { 4, 7, 0 }, { 9, 2, 8 } };	         
////		result = 11, 5, 0, 4, 2, 9
//		print(matrix);

	}
}
