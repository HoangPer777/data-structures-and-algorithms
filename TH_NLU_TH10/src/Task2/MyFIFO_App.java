package Task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyFIFO_App {
	// method stutter that accepts a queue of integers as a parameter and replaces
	// every element of the queue with two copies of that element
	// front [1, 2, 3]  
	// back [1, 1, 2, 2, 3, 3] 
	public static <E> void stutter(Queue<E> input) {
		Queue<E> result = new LinkedList<E>();
		for(E e : input) {
			result.add(e);
			result.add(e);
		}
		input.removeAll(input);
		input.addAll(result);
		System.out.println(input);
	}

	// Method mirror that accepts a queue of strings as a
	// parameter and appends the
	// queue's contents to itself in reverse order
	// front [a, b, c]
	// becomes [a, b, c, c, b, a]
	public static <E> void mirror(Queue<E> input) {
		Stack<E> stack = new Stack<E>();
		for(E e : input) {
			stack.push(e);	
		}
		int size = stack.size();
		while(size != 0) {
			input.add(stack.pop());
			size--;
		}
		System.out.println(input);
	}
	public static void main(String[] args) {
		Queue<Integer> input = new LinkedList<>();
		input.add(1);
		input.add(2);
		input.add(3);
//		stutter(input);
		System.out.println();
		mirror(input);
	}
}
