package TH1;

import java.util.Arrays;

public class Task1_2 {
	// Input: 10 11 12 13 14 16 17 19 20
	// Output: 15 18
	public static int[] getMissingValues(int[] arrayNum) {
		int indexResult = 0; 
		int[] result = new int [arrayNum[arrayNum.length -1] - arrayNum[0] - arrayNum.length + 1];
		int i = arrayNum[0];
		for(int j = 0; j < arrayNum.length; j++) {		
			if(arrayNum[j] != i) {
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
	public int[] fillMissingValues(int k, int[] arrayNum) {
		for(int i = 0; i < arrayNum.length; i++ ) {
			if(arrayNum[i] == -1) {
				
			}
		}
		return null;
	}
	
	
//	
	


	public static void main(String[] args) {
		int[] arrayNum = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		System.out.println(Arrays.toString(getMissingValues(arrayNum)));
		
		
		int []nums = {10, 11, 12, -1, 14, 10, 17, 19, 20};
//		System.out.println(Arrays.toString(findSymmetricNeighbors(nums, -1, 3)));
		
	}
}
