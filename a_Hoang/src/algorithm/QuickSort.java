package algorithm;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int[] array) {
	    if (array.length <= 1) {
	        return;
	    }
	    quickSortRecursive(array, 0, array.length - 1);
	}

	private static void quickSortRecursive(int array[], int low, int hight) {
	    if (low < hight) {
	        int partitionIndex = partition(array, low, hight);
	        quickSortRecursive(array, low, partitionIndex - 1);
	        System.out.println(Arrays.toString(array));
	        quickSortRecursive(array, partitionIndex + 1, hight); // Thay đổi partitionIndex ở đây
	        System.out.println(Arrays.toString(array));
	    }
	}

	private static int partition(int[] array, int low, int hight) {
	    int pivot = array[low]; // Thay đổi pivot ở đây
	    int i = low;
	    for (int j = low + 1; j <= hight; j++) {
	        if (array[j] < pivot) {
	            i++;
	            swap(array, i, j);
	        }
	    }
	    swap(array, low, i); // Hoán đổi pivot về vị trí đúng
	    return i;
	}

	private static void swap(int[] array, int low, int high) {
	    int temp = array[low];
	    array[low] = array[high];
	    array[high] = temp;
	}
	public static void main(String[] args) {
		int array[] = {  5, 4, 10, 2, 9, 45, 9 };

		quickSort(array);
		System.out.println(Arrays.toString(array));
	}

}
