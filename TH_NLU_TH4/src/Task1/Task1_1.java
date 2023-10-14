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
	
//	chưa xong
//	public static void selectionSort_recursive(int[] array) {
//		int stepNum;
//		if(stepNum > array.length - 1) {
//			return;
//		}else {
//			for(int j = stepNum; j < array.length; j++) {
//				int indexMax = findMax(stepNum,  array);
//				swap(array, indexMax, j);
//			}
//		}
////		selectionSort_recursive(array, stepNum + 1);
//	}
	
	
	
//
//	private static int findMax(int stepNum, int[] array) {
//		int max = array[stepNum];
//		int indexMax = stepNum;
//		for(indexMax = stepNum; indexMax < array.length; indexMax++) {
//			if(max < array[indexMax]) {
//				max = array[indexMax];
//			}
//		}
//		return indexMax;
//	}

	public static void main(String[] args) {
		int array[] = {1 , 6, 3, 9, 5};
		selectionSort(array);
//		selectionSort_recursive(array, 0);
		System.out.println(Arrays.toString(array));
	}
}
