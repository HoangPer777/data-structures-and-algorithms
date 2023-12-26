package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linkedList {

	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.removeFirst();
		System.out.println(obj);
		
//		List<String> list = new ArrayList<String>();
//		list.add("dog");
//		list.add("monkey");
//		list.add("cat");
//		list.add("lion");
//		Collections.sort(list);
//		for(String animal: list) {
//			System.out.println();
//		}
		
//		List<String> list1 = new ArrayList<String>();
//		List<String> list2 = new ArrayList<String>();
//		list1.add("a"); list1.add("b");
//		list2.add("a"); list2.add(1, "b");
//		System.out.println(list1.equals(list2));
		
//		int arr[] = new int[5];
//		for(int i =5; i > 0; i--) {
//			arr[5 -i] = i;
//		}
//		Arrays.sort(arr);
//		for(int i = 0; i < 5;++i) {
//			System.out.println(arr[i]);
//		}
		
//		OutOfMemory Error
//		List<String> a = new ArrayList<String>();
//		a.add("A");
//		a.add("B");
//		for(int i = 1; i < a.size(); i++) {
//			a.add(i, "+");
//			System.out.println(a);
//		}
		
	}
}
