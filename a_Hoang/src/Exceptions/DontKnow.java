package Exceptions;

import java.util.Arrays;

public class DontKnow {
//	tip1
	public static int getSize(int [][] arr2d) {
		return arr2d.length * arr2d[0].length;
	}
	public static void main(String[] args) {
//		int[][] test = {{1, 0, 2}, {2}, {3, 4, 6, 5}};
//		System.out.println(getSize(test));
		
//		tip2
//		Float f = new Float(12);
//		switch(f) {
//		case 12: System.out.println("tw");
//		case 0: System.out.println("tw");
//		default: System.out.println("tw");
//		}
		
//		int i = 1, j = -1;
//		switch(i) {
//		case 1: j = 1;
//		case 2: j = 2;
//		System.out.println(j);
//		}
		
		int arr[] = new int[4];
		Arrays.asList(args);
//		Arrays.mismatch(null, null);
		int a[] = Arrays.copyOf(arr, 6);
		System.out.println(Arrays.toString(a));
	}
}
