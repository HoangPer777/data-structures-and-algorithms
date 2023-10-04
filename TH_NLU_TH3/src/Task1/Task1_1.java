package Task1;

public class Task1_1 {
	private int[] array;

	public Task1_1(int[] array) {
		this.array = array;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int target) {
		int n = array.length;
		
		return find(n - 1, target);
	}

	public int find(int n, int target) {
		if (n == 0) {
			return -1;
		}
		if (array[n - 1] == target) {
			return array.length - 1;
		} else {
			return find(n - 1, target);
		}

	}

	public static void main(String[] args) {
		int[] array = { 12, 10, 9, 45, 2, 10, 10, 45 };
		Task1_1 task = new Task1_1(array);

//		int Iterative = task.iterativeLinearSearch(45);
//		System.out.println(Iterative);

		int recursive = task.recursiveLinearSearch(15);
		System.out.println(recursive);
	}

}
