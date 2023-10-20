package Task1;

import java.util.Arrays;

public class Task1_3 {
	public static void insertionSort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int key = i;
			while (key > 0 && array[key - 1] < current) {
				array[key] = array[key - 1];
				key--;
			}
			array[key] = current;
		}
	}

	public static void insertionSort_recursive(int array[]) {
		int n = array.length;
		if (n <= 1) {
			return;
		} else {
			sort_recursive(n - 2, array);
		}
	}

	private static void sort_recursive(int n, int[] array) {
		if(n <= 0) {
			return;
		}else {
			sorted(n, array[n], array);
			sort_recursive(n - 1, array);
		}
		
	}

	private static void sorted(int key, int value, int[] array) {
		// TODO Auto-generated method stub
		if(key <= 0 || array[key - 1] > value) {
			
		}
		sorted(key - 1, value, array);
	}

	public static void main(String[] args) {
		int array[] = { 1, 6, 3, 9, 5, 3, 6, 2, 8, 0, 7, 4 };
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}
}
