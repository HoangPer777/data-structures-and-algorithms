package Task1;

public class Task1_3 {
	private int[] array;

	public Task1_3(int[] array) {
		this.array = array;
	}

	public int iterativeBinarySearch(int target) {
		int low = array.length - 1;
		int high = 0;
		while (low >= high) {
			int mid = (low + high) / 2;
			if (target == array[mid]) {
				return mid + 1;
			} else if (target < array[mid]) {
				high = mid + 1;
			} else {
				low = mid - 1;
			}
		}
		return -1;
	}

	public int recursiveBinarySearch(int target) {
		int low = array.length - 1;
		int hight = 0;
		return binarySearch(target, low, hight);
	}

	public int binarySearch(int target, int low, int hight) {
		if (low < hight) {
			return -1;
		} else {
			int mid = (low + hight) / 2;
			if (target == array[mid]) {
				return mid + 1;
			} else if (target < array[mid]) {
				return binarySearch(target, low, mid + 1);
			} else {
				return binarySearch(target, mid - 1, hight);
			}
		}

	}

	public static void main(String[] args) {
		int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Task1_3 task = new Task1_3(array);

		int result = task.iterativeBinarySearch(4);
		System.out.println(result);

		int result2 = task.recursiveBinarySearch(4);
		System.out.println(result2);
	}
}
