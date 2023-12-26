package algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class test {
//	ex1
	public static int getPreviousOfNumberInListIter(int i, ListIterator<Integer> listIter) {
		int result = 0;
		while (listIter.hasNext()) {
			if (listIter.next() == i) {
				result = listIter.previous();
				break;
			}
		}
		return result;
	}

//	ex3
	public static ArrayList<Integer> danhSachChiaHetCho2(Iterator<Integer> iter) {
		ArrayList<Integer> result = new ArrayList();
		while (iter.hasNext()) {
			if (iter.next() % 2 == 0) {
				result.add(iter.next());
			}
		}
		return result;
	}

//	ex 9
	public static Collection get() {
		Collection sorted = new LinkedList();
		sorted.add("B");
		sorted.add("C");
		sorted.add("A");
		return sorted;
	}

//	ex 10
	public static Iterator reverse(List list) {
		Collections.reverse(list);
		return list.iterator();
	}

	public static void main(String[] args) {
//		ex 11
		// insert code here printf(1, 2)
//		Set set = new TreeSet(); 
////		Set set = new HashSet(); 
//		set.add(new Integer(2)); 
//		set.add(new Integer(1)); 
//		System.out.println(set); 

//		ex12
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("aAaA");
		strings.add("AaA");
		strings.add("aAa");
		strings.add("AAaa");
		Collections.sort(strings);
		for (String s : strings) {
			System.out.print(s + " ");
		}

//		ex 10
//		List list = new ArrayList(); 
//		list.add("1"); list.add("2"); list.add("3"); 
//		for (Object obj: reverse(list)) 
//		System.out.print(obj + ", "); 
//		for (Object obj : get()) {
//			System.out.print(obj + ", ");
//		}

//		ex 9
//		for (Object obj : get()) {
//			System.out.print(obj + ", ");
//		}

//		ex1
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(6);
//		list.add(5);
//		list.add(3);
//		list.add(7);
//		ListIterator<Integer> iter = list.listIterator();
//		System.out.println(getPreviousOfNumberInListIter(2, iter));

//		ex2
//		LinkedList<Integer> list = new LinkedList();
//		list.add(9);
//		list.addFirst(10);
//		list.add(7);
//		list.addLast(11);
//		list.add(8);
//		System.out.println(list);
//		HashMap<String, Integer> m = new HashMap();
//		m.put("I", 3);
//		m.put("will", 5);
//		m.put("pass", 7);
//		m.put("pass", 10);
//		System.out.println(m);

//		ex3
//		List<Integer> list3 = new ArrayList<Integer>();
//		for (int i = 1; i < 10; i++) { // i < 9 thì sẽ lỗi
//			list3.add(i);
//		}
//		ListIterator<Integer> iter3 = list3.listIterator();
//		System.out.println(danhSachChiaHetCho2(iter3).toString());

//		ex4
//		int x = 10;
//		int y = 10;
//		if (x++ < 11 || ++y > 10) {
//			x++;
//		}
//		System.out.println("x: " + x);
//		System.out.println("y: " + y);

//		Set<Integer> set = new HashSet<Integer>();
//		Integer i1 = 45; 
//		Integer i2 = 46; 
//		set.add(i1); 
//		set.add(i1); 
//		set.add(i2); System.out.print(set.size() + " "); 
//		set.remove(i1); System.out.print(set.size() + " "); 
//		i2 = 47; 
//		set.remove(i2); System.out.print(set.size() + " ");

		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		for (int i = 606; i < 613; i++)
			if (i % 2 == 0)
				s.add(i);
		subs = (TreeSet) s.subSet(608, true, 611, true);
//		subSet(fromElement, fromInclusive, toElement, toInclusive);
//		fromInclusive = true -> [
//		fromInclusive = false -> ]
//		toInclusive cũng thế	
		s.add(609);
		System.out.println(s + " " + subs);
		
		
	}
}
