package Exceptions;

public class ClassCastException {
	public static void main(String[] args) {
		Object x[] = new String[1]; // tạo ra là String
		x[0] = "Hoang";
		Integer y = (Integer) x[0]; // mà vào Integer
		System.out.println(y);
	}
}
