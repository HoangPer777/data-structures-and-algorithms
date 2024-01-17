package Recursion;

public class InSao {
//	public static void patternStar1(int n) {
//		for (int i = n; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	public static void patternStar11(int n) {
		if (n == 1) {
			System.out.println("*");
			return;
		} else {
			int count = 0;
			patternStar111(n, count);
		}

	}

	public static void patternStar111(int n, int count) {
		if (n == 1) {
			System.out.print("*");
			count++;
			System.out.println();
			patternStar111_(n, count);
			return;
		} else {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
			patternStar111(n - 1, count + 1);
		}
	}

	public static void patternStar111_(int n, int count) {
		if (n > count) {
			return;
		} else {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
			patternStar111_(n + 1, count);
		}
	}

	public static void patternStar2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		patternStar1(4); // ok
//		System.out.println();
//		patternStar2(4); // ok

		patternStar11(4);
	}
}
