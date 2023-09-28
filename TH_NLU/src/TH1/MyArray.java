package TH1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class MyArray {
	public static int[] mirror(int[] array) {
		int result[] = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
			result[i + array.length] = array[array.length - i - 1];
		}

		return result;
	}


	public static int[] removeDuplicates(int[] array) {
		int[] result = array;
		for (int i = 0; i < result.length; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] == result[j]) {
					for (int h = j; h < result.length - 1; h++) {
						int temp = result[h];
						result[h] = result[h + 1];
						result[h + 1] = temp;
						
					}
					result = Arrays.copyOf(result, result.length - 1);
				}
				
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3 };
//		System.out.println(Arrays.toString(mirror(array)));

		int array2[] = { 1, 3, 5, 1, 3, 7, 9, 8 };
		System.out.println(Arrays.toString(removeDuplicates(array2)));
	}
}
