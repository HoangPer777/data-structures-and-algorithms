package Stack_queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class stack {
	

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Stack<String> backup = new Stack<String>();
		stack.add("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		for(int i = 0; i < stack.size() ; i++) {
			stack.get(i);
		}

//		while (!stack.isEmpty()) {
//			String next = stack.pop();
//			backup.push(next);
//		}
//		String a = stack.pop();
//		String b = stack.peek();
//		System.out.println(stack.isEmpty());
//		System.out.println(a + b);
		
//		Stack s = new Stack();
//		String text = "ABCDEFG";
//		char[]a = text.toCharArray();
//		
//		for(int i = 0; i < a.length;i++ ) {
//			if(i % 2 == 0 ) {
//				s.push(a[i]);
//			}else {
//				s.pop();
//			}
//		}
//		System.out.println(s);
		

		Stack obj = new Stack();
//		Stack<Integer> obj = new Stack<Integer>();
		obj.push(new Integer(2));
		obj.pop();
		obj.push(new Integer(5));
		System.out.println(obj);
	}

}
