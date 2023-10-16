package Task2;

import java.util.Arrays;

public class Task2_2 {

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
			quickSortRecursive(array, partitionIndex + 1, hight);
		}
	}

	private static int partition(int[] array, int low, int hight) {
//		int pivot = getPivot_Random(array);
//		int pivot = getPivot_MedianOfThree(array);
//		int pivot = getPivot_Last(array);
		int pivot = array[hight];
		int i = (low - 1);
		for (int j = low; j <= hight - 1; j++) {
//			Tăng dần
//			if (array[j] < pivot) {
//				i++;
//				swap(array, i, j);
//			}
			if (array[j] > pivot) {
	            i++;
	            swap(array, i, j);
	        }
		}
		swap(array, i + 1, hight);
		return (i + 1);
	}

	private static void swap(int[] array, int low, int hight) {
		// TODO Auto-generated method stub
		int stemp = array[low];
		array[low] = array[hight];
		array[hight] = stemp;
	}

	// select pivot element based on the median of three strategy - trung vị 3 điểm
	private static int getPivot_MedianOfThree(int[] array) {
		int a = array[0];
		int b = array[(array.length - 1) / 2];
		int c = array[array.length - 1];

		if (b < a && a < c) {
			return a;
		} else if (c < a && a < b) {
			return a;
		} else if (a < b && b < c) {
			return b;
		} else if (c < b && b < a) {
			return b;
		} else {
			return c;
		}

	}

	// select pivot element based on the first element in the array
	private static int getPivot_First(int[] array) {
		// TODO
		return array[0];
	}

	// select pivot element based on the last element in the array
	private static int getPivot_Last(int[] array) {
		// TODO
		return array[array.length - 1];
	}

	// select pivot element based on choosing a randomly element in the array
	private static int getPivot_Random(int[] array) {
		int index = (int) (Math.random() * array.length);
		return index;
	}

	public static void main(String[] args) {
		int array[] = { 1, 6, 3, 9, 5, 7, 10, 2, 8, 4 };

		quickSort(array);
		System.out.println(Arrays.toString(array));

	}

}
