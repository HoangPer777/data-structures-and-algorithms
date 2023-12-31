package medium;

public class _7_reverse {
	public static int reverse(int x) {
		int n;
		int result = 0;
		long check = 0;

		while (x != 0) {
			n = x % 10;
			x /= 10;
			result = result * 10 + n;  // nếu vượt quá bộ nhớ kiểu sẽ ra kết quả sai
			check = check * 10 + n;
		}
		if (check != result) {
			return 0;
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
}
