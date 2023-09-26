package hard;
/*You are given an array of integers nums, there is a sliding window of size 
 * k which is moving from the very left of the array to the very right. 
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7*/

public class _239_maxSlidingWindow_hard {
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int result[] =  new int[nums.length - k + 1];
		
		for (int i = 0; i <= nums.length - k; i++) {
			int j = i;
			int max = nums[j];
			for (j = i; j < i + k; j++) {
				if (max < nums[j]) {
					max = nums[j];
				}
			}
			result[i] = max;
//			return result;
			System.out.print(max + ", ");
		}

		
		return result;

	}

	public static void main(String[] args) {
		int nums[]= {1,3,-1,-3,5,3,6,7};
		maxSlidingWindow(nums, 3);
	}
}
