package medium;
//1. Two Sum
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]*/

public class _1_Two_Sum {
//	public static void twoSum(int[] nums, int target) {
//		int location1 = 0;
//		int location2 = 0;
//		for (int i = 0; i <= nums.length - 1; i++) {
//			for (int j = 0; j <= nums.length - 1; j++) {
//				if (nums[i] + nums[j] == target) {
//					location1 = j;
//					location2 = i;
//				}
//			}
//		}
//		System.out.println(location1 +" "+ location2);
//	
//	}

	public static void twoSum(int[] nums, int target) {
		int location1 = 0;
		int location2 = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			for (int j = 0; j <= nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					location1 = j;
					location2 = i;
					break;
				}
			}
		}
		int[] arr = { location1, location2 };
		
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		twoSum(nums, 6);
	}
}