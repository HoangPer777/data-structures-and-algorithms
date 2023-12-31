package TH2;

public class Task2_2 {
	public static void drawPyramid_1(int n) {
		for (int i = 0, h = 1; i < n; i++, h++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" "); // In khoảng trắng để tạo hình tam giác
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(h);
			}
			System.out.println();
		}
	}

	public static void drawPyramid_2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" "); // In khoảng trắng để tạo hình tam giác
			}
			for (int j = 0, h = 1; j < i + 1; j++, h++) {
				System.out.print(h + " ");
			}
			System.out.println();
		}
	}

	public static void drawPyramid_3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" "); // In khoảng trắng để tạo hình tam giác
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	public static void drawPyramid_4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" "); // In khoảng trắng để tạo hình tam giác
			}

			int a = 0;
			for (int k = 0; k < i * 2 - 1; k++) {
				if (k <= (i * 2 - 1) / 2) {
					System.out.print(k + 1 + "");
				}
				if (k > (i * 2 - 1) / 2) {
					System.out.print(k - (a * 2 + 1));
					a++;
				}
			}

			System.out.println();
		}
	}

	public static void drawPyramid_5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" "); // In khoảng trắng để tạo hình tam giác
			}

			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");
//				if(k <= (i * 2 - 1) / 2) {
//					System.out.println();
//				}
			}

			for (int k = 0; k < 9; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public static void drawPyramid_6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int h = 0; h < n - i; h++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void drawPyramid_7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int h = 0; h < n - i; h++) {
				System.out.print(n - i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		drawPyramid_1(9);
//		drawPyramid_2(9);
		drawPyramid_3(9);
//		drawPyramid_4(9);
//		drawPyramid_5(9);
//		drawPyramid_6(9);
//		drawPyramid_7(9);
	}
}
