package Exceptions;

public class NumberFormatException {
	public static void main(String[] args) {
		String str = "123ABC"; // Chuỗi không thể chuyển đổi thành số nguyên
		int number = Integer.parseInt(str);
		System.out.println("Số nguyên: " + number);
//	        try {
//	            String str = "123ABC"; // Chuỗi không thể chuyển đổi thành số nguyên
//	            int number = Integer.parseInt(str);
//	            System.out.println("Số nguyên: " + number);
//	        } catch (NumberFormatException e) {
//	            System.out.println("NumberFormatException: Chuỗi không thể chuyển đổi thành số nguyên.");
//	            e.printStackTrace();
//	        }
	}
}
