package Task1;

import java.util.Arrays;

public class Task1_2 {
	public static void bubbleSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1 - i; j++ ) {
				if(array[j] < array[j + 1]) {
					swap(array, j);
				}
			}
		}
	}
	
	
	public static void bubbleSort_recursive(int[] array, int n) {
		if(n == 1) {
			return;
		}
		for(int i = 0; i < array.length - 1;i++) {
			if(array[i] < array[i + 1]) {
				swap(array, i);
			}
		}
		bubbleSort_recursive(array, n - 1);
	}

	
	private static void swap(int[] array, int j) {
		int stemp = array[j + 1];
		array[j + 1] = array[j];
		array[j] = stemp;
		
	}
	public static void main(String[] args) {
		int array[] = {1 , 6, 3, 9, 5};
		bubbleSort(array);
		bubbleSort_recursive(array, array.length);
		System.out.println(Arrays.toString(array));
	}
}
