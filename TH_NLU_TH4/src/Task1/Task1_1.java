package Task1;

import java.util.Arrays;

public class Task1_1 {
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[maxIndex] < array[j]) {
					maxIndex = j;
				}
			}
			swap(array, maxIndex, i);
		}
	}

	private static void swap(int[] array, int maxIndex, int j) {
		int stemp = array[maxIndex];
		array[maxIndex] = array[j];
		array[j] = stemp;
	}

//	recursive
	public static void selectionSort_recursive(int[] array) {
		int n = array.length;
		if (n <= 1) {
			return;
		} else {
			sort_recursive(n, array);
		}
	}

	public static void sort_recursive(int n, int[] array) {
		if (n <= 0) {
			return;
		} else {
			findMin_swap(n - 1, array);
			sort_recursive(n - 1, array);
		}
	}

	private static int findMin_swap(int value, int[] array) {
		int min = array[value];
		int indexmin = value;
		for (int i = value; i >= 0; i--) {
			if(min > array[i]) {
				min = array[i];
				indexmin = i;
			}
		}
		swap(array, indexmin, value);
		return indexmin;
	}

	public static void main(String[] args) {
		int array[] = { 1, 6, 3, 9, 5, 3, 6, 2, 8, 0, 7, 4 };
		selectionSort(array);
		System.out.println(Arrays.toString(array));
		selectionSort_recursive(array);
		System.out.println(Arrays.toString(array));
	}
}
