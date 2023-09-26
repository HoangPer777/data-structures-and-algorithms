package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4*/
public class _215_findKthLargest {
//	public static int findKthLargest(int[] nums, int k) {
//		int Largest = nums[0];
//			for(int i = 0; i <= nums.length - 1; i++) {
//				for(int j = i; j <= nums.length - 1; j++) {
//					if(nums[i] < nums[j]) {
//						int temp = nums[i];
//						nums[i] = nums[j];
//						nums[j] = temp;
//					}
//				}
//			}
//		Largest = nums[k - 1];
//		return Largest;
//        
//    }

	public static int findKthLargest(int[] nums, int k) {
		int Largest = nums[0];
		Arrays.sort(nums);
	
		Largest = nums[nums.length - k];
		return Largest;

	}

	public static void main(String[] args) {
		int nums[] = { 3, 2, 1, 5, 6, 4 };
		int nums2[] = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		System.out.println(findKthLargest(nums2, 4));
	}
}
