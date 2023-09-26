package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true*/
public class _217_containsDuplicate {

//	public static void main(String[] args) {
//		int[] mang = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 1 };
//
//		// Tạo một HashMap để lưu trữ số lần xuất hiện của các phần tử
//		Map<Integer, Integer> demSoLanXuatHien = new HashMap<>();
//
//		// Lặp qua mảng và đếm số lần xuất hiện của mỗi phần tử
//		for (int phanTu : mang) {
//			if (demSoLanXuatHien.containsKey(phanTu)) {
//				// Nếu phần tử đã tồn tại trong Map, tăng giá trị đếm lên 1
//				int soLanXuatHien = demSoLanXuatHien.get(phanTu);
//				demSoLanXuatHien.put(phanTu, soLanXuatHien + 1);
//			} else {
//				// Nếu phần tử chưa tồn tại trong Map, thêm phần tử vào Map với giá trị đếm là 1
//				demSoLanXuatHien.put(phanTu, 1);
//			}
//		}
//
//		// In ra số lần xuất hiện của mỗi phần tử
//		for (Map.Entry<Integer, Integer> entry : demSoLanXuatHien.entrySet()) {
//			System.out.println("Phần tử " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
//		}
//	}

	public static boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> mapList = new HashMap<>();
		for (int implement : nums) {
			if (mapList.containsKey(implement)) {
				int conut = mapList.get(implement);
				mapList.put(implement, conut + 1);
			} else {
				mapList.put(implement, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : mapList.entrySet()) {
			if(entry.getValue() != 1) {
				return true;
			}
		}

		return false;
	}

//	###waste of time
//	public static boolean containsDuplicate(int[] nums) {
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					return true;
//				}
//			}
//		}
//
//		return false;
//
//	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 1 };
		int nums2[] = { 1, 2, 3, 4 };
		int nums3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		int nums4[] = { 2, 14, 18, 22, 22 };
		

		System.out.println(containsDuplicate(nums4));
	}

}
