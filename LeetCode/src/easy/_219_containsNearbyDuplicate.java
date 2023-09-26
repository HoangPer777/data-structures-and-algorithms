package easy;

// https://leetcode.com/problems/contains-duplicate-ii/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class _219_containsNearbyDuplicate {
	// waste of time
//	public static boolean containsNearbyDuplicate(int[] nums, int k) {
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if ((nums[i] == nums[j]) && (Math.abs(i - j) <= k)) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		if (k == 0) {
			return false;
		}

		Map<Integer, Integer> numss = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int integer = nums[i];

			if (numss.containsKey(integer) && (i - numss.get(integer) <= k)) {
				return true;
			} else {
				numss.put(integer, i);
			}
			System.out.println(i + " - " + numss.get(integer));
		}
		return false;
	}
	
	
//	 public boolean containsNearbyDuplicate(int[] nums, int k) {
//		    HashSet<Integer> set = new HashSet<>();
//		    for(int i = 0; i < nums.length; i++){
//		        if(i > k){
//		            set.remove(nums[i - k - 1]);
//		        }
//		        if(!set.add(nums[i])){
//		            return true;
//		        }
//		    }
//		    return false;
//		 }

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 2, 3 };
		System.out.println(containsNearbyDuplicate(nums, 2));
		containsNearbyDuplicate(nums, 2);
	}
}
