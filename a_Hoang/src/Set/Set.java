package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();
//		set.add("One");
//		set.add("Two");
//		set.add("Three");
//		set.add("Four");
//		set.add("Five");
////		for (String string : set) {
////			set.remove("Four");
////			System.out.println(string);
////		}
////		System.out.println();
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		HashSet<Circle> set1 = new HashSet<Circle>();
		set1.add(new Circle(1));
		set1.add(new Circle(2));
		set1.add(new Circle(3));
		set1.add(new Circle(2));		
//		ConcurrentModificationException
//		for (Circle circle : set1) {
//			if(circle.getRadius() == 2 ) {
//				set1.remove(circle);
//			}
//		}
		Iterator<Circle> iter1 = set1.iterator(); // mutable
		while(iter1.hasNext()) {
			Circle next = iter1.next();
			if(next.getRadius() == 2) {
				iter1.remove();
			}
		}
	
		System.out.println(set1.toString());
		
	}
}
