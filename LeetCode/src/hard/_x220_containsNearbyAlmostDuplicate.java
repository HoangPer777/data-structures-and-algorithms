package hard;

// https://leetcode.com/problems/contains-duplicate-iii/
import java.util.ArrayList;
import java.util.List;

public class _x220_containsNearbyAlmostDuplicate {
//	waste of time
//	public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if(i != j ) {
//					if((Math.abs(i - j ) <= indexDiff) && (Math.abs(nums[i] - nums[j]) <= valueDiff)) {
//						return true;
//					}
//				}
//			}
//		}
//		return false;
//	}

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < Math.abs(i - j); i++) {
//
//		}

		return false;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 5, 9, 1, 5, 9 };
		System.out.println(containsNearbyAlmostDuplicate(nums, 2, 3));
	}
}

//for (int j = i + 1; j < nums.length; j++) {
//	if(i != j ) {
//		if((Math.abs(i - j ) <= indexDiff) && (Math.abs(nums[i] - nums[j]) <= valueDiff)) {
//			return true;
//		}
//	}
//}