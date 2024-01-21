package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arr {

	public static void main(String[] args) {

//		tip1
//		int x = 1;
//		int[] y = new int[10];
//		modify(x, y);
//		System.out.println("x is " + x);
//		System.out.println("y[0] is " + y);
		
//		tip2
//		int arr1[] = {1,2,3};
//		int arr2[] = arr1;	
//		arr1[0]++;
//		System.out.println("arr1[0] " + arr1[0]);
//		System.out.println("arr2[0] " + arr2[0]);
		
//		tip3
//		int arr1[] = {1,2,3};
//		int arr2[] = arr1.clone();
//		arr1[0]++;
//		String arr1[] = {"hoang" , "pro"};
//		String arr2[] = arr1.clone();
//		arr1[0] = "h";
//		System.out.println("arr1[0] " + arr1[0]);
//		System.out.println("arr2[0] " + arr2[0]);
		
		
//		tip4
//		int[] arr1 = {1, 2, 3};
//	
//		int arr2[] = new int [arr1.length];
//		
//		System.arraycopy(arr1, 0, arr2, 0, arr2.length);
//		arr1[0]++;
//		for (int i : arr1) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i : arr2) {
//			System.out.print(i);
//		}
//		System.out.println("arr1[0] " + arr1[0]);
//		System.out.println("arr2[0] " + arr2[0]);
		
//		int[][] a = new int[5][];
//		for(int i = 0; i < a.length;i++) {
//			a[i] = new int[i+ 2];
//		}
//		System.out.println(Arrays.deepToString(a));
		
		int arr[] = new int[5];
		for(int i = 5; i > 0; i--) {
			arr[5 - i] = i;
		}
		Arrays.fill(arr, 1, 4, 8);
//		Arrays.fill(array, [startIndex, endIndex), value);
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

//	tip1
//	private static void modify(int x, int[] y) {
//		x = 1001;
//		y[0] = 5555;
//	}

	
	
}
