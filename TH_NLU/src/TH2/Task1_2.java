package TH2;

public class Task1_2 {

//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
	// get the nth value of the Fibonacci series
	public static int getFibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		// TODO
		return getFibonacci(n - 2) + getFibonacci(n - 1);
	}

// 		This method is used to display a Fibonaccci series based on
//		the parameter n.Ex.n=10==>0 1 1 2 3 5 8 13 21 34

	public static void printFibonacci(int n) {
//		for (int i = 0; i <= n; i++) {
//			System.out.print(getFibonacci(i) + " ");
//		}
		
//		đệ quy 
		if (n < 0) {
			return;
		}	
		System.out.print(getFibonacci(n) + " ");
		printFibonacci(n - 1);
	

	}

	public static void main(String[] args) {
		printFibonacci(10);
	}

}
