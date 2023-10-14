package Task1;

import java.util.Arrays;

public class Task1_3 {
	public static void insertionSort(int[] array) {
		int n = array.length;
		for(int key = 1; key < n; key++) {
			int cur = array[key];
			int j = key;
			while(j > 0 && array[j - 1] < cur) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = cur;
		}

	}
	public static void main(String[] args) {
		int array[] = {1 , 6, 3, 9, 5};
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}
}
