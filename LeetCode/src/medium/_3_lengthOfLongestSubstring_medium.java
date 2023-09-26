package medium;

import java.util.HashMap;

/*Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
public class _3_lengthOfLongestSubstring_medium {
	public static int lengthOfLongestSubstring(String s) {
		int result = 1;

		if (s.length() < 1) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (result <= j - i) {
						result = j - i;
						return result;
					}

				}
				for (int a = j; a <= s.length() - 1; a++) {
					for (int e = j + 1; e <= s.length() - 1; e++) {
						if (s.charAt(a) == s.charAt(e)) {
							if (result < (a - e)) {
								result = a - e;
								return result;
							}
						}
					}
				}
			}

		}
		return result + 1;
	}

	public static void main(String[] args) {
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";
		String s4 = "";
		String s5 = " ";
		String s6 = "au";
		System.out.println(lengthOfLongestSubstring(s5));

	}
}
