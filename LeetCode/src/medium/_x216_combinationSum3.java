package medium;

import java.util.ArrayList;
import java.util.List;

public class _x216_combinationSum3 {
	public static List<List<Integer>> combinationSum3(int k, int n) {
	    List<List<Integer>> result = new ArrayList<>();
	    List<Integer> currentCombination = new ArrayList<>();
	    backtrack(1, k, n, currentCombination, result);
	    return result;
	}

	private static void backtrack(int start, int k, int n, List<Integer> currentCombination, List<List<Integer>> result) {
	    if (n == 0 && k == 0) {
	        result.add(new ArrayList<>(currentCombination));
	        return;
	    }

	    if (n < 0 || k <= 0 || start > 9) {
	        return;
	    }

	    for (int i = start; i <= 9; i++) {
	        currentCombination.add(i);
	        backtrack(i + 1, k - 1, n - i, currentCombination, result);
	        currentCombination.remove(currentCombination.size() - 1);
	    }
	}

	
	public static void main(String[] args) {
	    int k = 3; // Đổi giá trị này thành số lượng số bạn muốn trong mỗi kết quả
	    int n = 15; // Đổi giá trị này thành tổng bạn muốn đạt được

	    List<List<Integer>> results = combinationSum3(k, n);

	    for (List<Integer> result : results) {
	        System.out.println(result);
	    }
	}

}
