package TH2;

public class Task2_3 {
	public static void drawChristmasTree(int n) {
		for (int h = 1; h <= n; h++) {
			for (int i = 0; i < h; i++) {
				for (int l = 0; l <= n -h; l++) {
					System.out.print(" ");
				}
				for (int j = 0; j < h - i - 1; j++) {
					System.out.print(" "); // In khoảng trắng để tạo hình tam giác
				}
				for (int k = 0; k < (i + 1) * 2 - 1; k++) {
					System.out.print("*");
				}

				System.out.println();
			}
		}

		// special - Vẽ thân cây 
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("|"); // In thân cây
		}

	}

//	public static void drawFloor(int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n - i - 1; j++) {
//				System.out.print(" "); // In khoảng trắng để tạo hình tam giác
//			}
//			for (int k = 0; k < (i + 1) * 2 - 1; k++) {
//				System.out.print("x");
//			}
//
//			System.out.println();
//		}
//	}

	public static void main(String[] args) {
		drawChristmasTree(5);
	}
}
