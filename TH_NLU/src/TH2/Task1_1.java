package TH2;

public class Task1_1 {
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		if (n == 1) {
			return 0;
		} else {
			return getSn1(n - 1) + ((n % 2 == 0) ? -n : n);
		}
	}

	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {
		// TODO
		if (n == 1) {
			return 1;
		} else {
			return getSn2(n - 1) + factorial(n);
		}

	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return factorial(n - 1) * n;
	}

	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (int) (getSn3(n - 1) + Math.pow(n, 2));
		}
	}

	// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
	public static double getSn4(int n) {
		// TODO
		if (n < 1) {
			return 1;
		}
		return getSn4(n - 1) + 1 / Multiplication(n);
	}

	public static double Multiplication(int n) {
		if (n < 1) {
			return 1;
		}
		return Multiplication((n - 1)) * (n * 2);

	}

	public static void main(String[] args) {
		System.out.println(getSn1(5));
		System.out.println(getSn2(3));
		System.out.println(getSn3(4));
		System.out.println(getSn4(3));
		
	}
}
