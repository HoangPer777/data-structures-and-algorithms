package TH1;

import java.util.Arrays;

public class Task1_2 {

	private int[] arrayNum;

	public Task1_2(int[] arrayNum) {
		super();
		this.arrayNum = arrayNum;
	}

	// Input: 10 11 12 13 14 16 17 19 20
	// Output: 15 18
	public int[] getMissingValues() {
		int indexResult = 0;
		int[] result = new int[arrayNum[arrayNum.length - 1] - arrayNum[0] - arrayNum.length + 1];
		int i = arrayNum[0];
		for (int j = 0; j < arrayNum.length; j++) {
			if (arrayNum[j] != i) {
				result[indexResult] = i;
				indexResult++;
				j++;
			}
			i++;
		}
		return result;
	}

	// Input: 10 11 12 -1 14 10 17 19 20
	// Output(k=3): 10 11 12 12 14 16 17 19 20
	public int[] fillMissingValues(int k) {
		
	

		for (int i = 0; i < arrayNum.length; i++) {
			
			outer: if (arrayNum[i] == -1) {
				int left = i - (k / 2); // 1.5 -> 1
				int right = i + (k / 2);
				if (k == 1) {
					arrayNum[i] = (arrayNum[i - 1] < arrayNum[i + 1]) ? arrayNum[i - 1] : arrayNum[i + 1];
				}
				if (i == 0) {
					arrayNum[i] = averageSpecial(1, k + 1, k);
					break outer;
				}
				if (i == arrayNum.length - 1) {
					arrayNum[i] = averageSpecial(arrayNum.length - 1 - k, arrayNum.length - 1, k);
					break outer;
				}

				if (k % 2 == 0) {
					arrayNum[i] = average(left, right, k);
				}
				if (k % 2 != 0) {
					int minLeft = left - 1;
					int maxRight = right + 1;
					arrayNum[i] = Math.min(average(minLeft, right, k), average(left, maxRight, k));
				}
			}
			
		}
		for(int i = 0; i < arrayNum.length - 1; i++) {
			if (arrayNum[i] > arrayNum[i + 1]) {
				arrayNum[i + 1] = -1;
				fillMissingValues(k);
			}
		}
		return arrayNum;
	}

	public int average(int start, int end, int k) {
		int sum = 0;
		for (int j = start; j <= end; j++) {
			sum += arrayNum[j];
		}
		return (sum + 1) / k;
	}

	public int averageSpecial(int start, int end, int k) {
		int sum = 0;
		for (int j = start; j < end; j++) {
			sum += arrayNum[j];
		}
		return (sum) / k;
	}

//	

	public static void main(String[] args) {
		int[] arrayNum = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		Task1_2 MyArray = new Task1_2(arrayNum);

//		int[] numMissingValues = MyArray.getMissingValues();
//		System.out.println(Arrays.toString(numMissingValues));

		int[] nums = { 10, 11, 12, -1, 14, 10, 17, 19, 20, };
		Task1_2 MyArray2 = new Task1_2(nums);
		int[] filledMissingValues = MyArray2.fillMissingValues(3);
		System.out.println(Arrays.toString(filledMissingValues));

	}
}
