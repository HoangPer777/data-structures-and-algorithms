package Task1;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyLIFO_App {
	// This method reserves the given array
	public static <E> void reserve(E[] array) {
		Stack<E> result = new Stack<E>();
		for (E e : array) {
			result.push(e);
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = result.pop(); // lấy ra mất luôn
		}
		for (E e : array) {
			System.out.print(e + ", ");
		}
	}

	// This method checks the correctness of the given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==> false
	public static boolean isCorrect(String input) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '[' || c == '(' || c == '{') {
				stack.push(c);
			} else if (c == ']' || c == ')' || c == '}') {
				if (stack.empty()) {
					return false;
				}
				char ch = stack.pop();
				if ((c == ']' && ch != '[') || (c == '}' && ch != '{') || (c == ')' && ch != '(')) {
					return false;
				}

			}
		}
		return stack.isEmpty();
	}

	// This method evaluates the value of an expression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
		if (!isCorrect(expression)) {
			System.out.println("check expression");
		}
		Stack<Integer> operandStack = new Stack<Integer>();
		Stack<String> operatorStack = new Stack<String>();

		String tokens[] = insertSpace(expression).split(" ");
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (tokens[i].isEmpty()) {
				continue;
			} else if (tokens[i].equals("(")) {
				operatorStack.add(tokens[i]);
			} else if (isNum(tokens[i])) {
				operandStack.push(Integer.parseInt(tokens[i]));
			} else if ((tokens[i].equals("+")) || (tokens[i].equals("-")) || (tokens[i].equals("*"))
					|| (tokens[i].equals("/"))) {
				while((!operatorStack.isEmpty()) && (getPriority(operatorStack.peek()) >= getPriority(tokens[i]) )) {
					System.out.println("H");
					operandStack.push(calculate(operandStack, operatorStack));
				}
				operatorStack.push(tokens[i]);
			} else if (tokens[i].equals(")")) {
				operandStack.push(calculate(operandStack, operatorStack));
				operatorStack.pop();  // Bỏ đi dấu "("
			}
		}
		// Xử lý tất cả các phép toán còn lại trong stack
		while (!operatorStack.isEmpty()) {
			operandStack.push(calculate(operandStack, operatorStack));
		}
		return operandStack.pop();
	}

	public static boolean isNum(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			try {
				// Chuyển đổi chuỗi thành số thực
				Double.parseDouble(value);
				return true;
			} catch (NumberFormatException e2) {
				return false; // Không phải số nguyên hoặc số thực
			}
		}

	}

	public static String insertSpace(String expression) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (c == '(' || c == ')' || c == '+' || c == '-' || c == '*' || c == '/') {
				builder.append(" " + c + " ");

			} else {
				builder.append(c);
			}

		}
		return builder.toString();
	}

	public static int calculate(Stack<Integer> operandStack, Stack<String> operatorStack) {
		String operator = operatorStack.pop();
		int operand1 = operandStack.pop();
		int operand2 = operandStack.pop();
		if (operator.equals("+")) {
			return operand1 + operand2;
		}
		if (operator.equals("-")) {
			return operand1 - operand2;
		}
		if (operator.equals("*")) {
			return operand1 * operand2;
		}
		if (operator.equals("/")) {
			return operand1 / operand2;
		} else {
			return 0;
		}
//		operandStack.pop();

	}

	public static int getPriority(String operator) {
		if (operator.equals("+") || operator.equals("-")) {
			return 1;
		} else if (operator.equals("*") || operator.equals("/")|| operator.equals(")")) {
			return 2;
		}
		return 0;

	}
//	

	public static void main(String[] args) {
//		Integer array[] = { 1, 2, 3, 4, 5 };
//		reserve(array);
//		System.out.println(isCorrect("()(())[]{(())}"));

		String expression = "51 + (54 *(3+2))";
		String expression2 = "(1+2)*4 - 3";
		String expression3 = "(1+2)";
//		evaluateExpression(expression);
		System.out.println(evaluateExpression(expression));
//		System.out.println(insertSpace(expression));
//		System.out.println(isNum(")"));
	}

}
