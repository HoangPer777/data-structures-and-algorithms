package TH3;

public class Task1_2 {
	private int[] array;

	public Task1_2(int[] array) {
		this.array = array;
	}

	// To find the index of the target in the sorted array. If the
//	target is not found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
		int low = 0;
		int hight = array.length - 1;
		while (low <= hight) {
			int mid = (low + hight) / 2;
			if (target == array[mid]) {
				return mid + 1;
			} else if (target < array[mid]) {
				hight = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	// To find the index of the target in the sorted array. If the
//	target is not
	// found in the array, then the method returns -1.

	public int recursiveBinarySearch(int target) {
		int low = 0;
		int hight = array.length;
		return binarySearch(target, low, hight);
	}

	public int binarySearch(int target, int low, int hight) {
		int mid = (low + hight) / 2;
		if (target == array[mid]) {
			return mid + 1;
		} else if (target < array[mid]) {
			return binarySearch(target, low, mid - 1);
		} else {
			return binarySearch(target, mid + 1, hight);
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Task1_2 task = new Task1_2(array);
	
		int result = task.iterativeBinarySearch(10);
		System.out.println(result);

		int result2 = task.recursiveBinarySearch(10);
		System.out.println(result2);
	}
}
