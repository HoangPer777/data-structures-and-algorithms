package Task2;

import java.util.Arrays;

public class Task2_1 {
	public static void mergeSort(int array[]) {
		if (array.length > 1) {
//			điểm giữa 
			int middle = array.length / 2;
//			coppy các phần từ gốc vào mảng bên trái và phải
			int[] left = Arrays.copyOfRange(array, 0, middle);
			int[] right = Arrays.copyOfRange(array, middle , array.length);

//			gọi đệ quy để làm tương tự, để chia nhỏ mảng đến khi mảng chỉ còn 1 phần tử 
			mergeSort(left);
			mergeSort(right);

//			gọi merge để sắp xếp các phần từ trong mảng left, right 
			merge(left, right, array);

		}
	}

	private static void merge(int[] left, int[] right, int[] array) {
		int i = 0, j = 0, k = 0;
//		tăng dần
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

//		giảm dần
//		 while (i < left.length && j < right.length) {
//			    if (left[i] >= right[j]) { // thay đổi dấu so sánh
//			      array[k++] = left[i++]; 
//			    } else {
//			      array[k++] = right[j++];
//			    }
//			  }

		while (i < left.length) {
			array[k++] = left[i++];
		}

		while (j < right.length) {
			array[k++] = right[j++];
		}

	}

	public static void main(String[] args) {
		int array[] = { 1, 6, 3, 9, 5, 7, 10, 2, 8, 4 };
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
}
