package TH3;

public class Task1_3 {
	private int[] array;

	public Task1_3(int[] array) {
		this.array = array;
	}
	public int iterativeBinarySearch(int target) {
		int low = 0;
		int hight = array.length - 1;
		while (low <= hight) {
			int mid = (low + hight) / 2;
			if (target == array[mid]) {
				return mid;
			} else if (target < array[mid]) {
				low = mid + 1;
			} else {
				hight = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {10 , 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Task1_2 task = new Task1_2(array); 
		int result = task.iterativeBinarySearch(10);
		System.out.println(result);
	}
}
