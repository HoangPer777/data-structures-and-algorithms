package Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SameSame {
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		Integer i1 = 10;
//		Integer i2 = 20;
//		Integer i3 = 10;
//		list.add(i1);
//		list.add(i2);
//		System.out.println(list.contains(i1));
//		System.out.println(list.contains(i3));
		
//		ArrayList<String> list1 = new ArrayList<String>();
//		String s1 = new String("IT");
//		String s2 = new String("NLU");
//		String s3 = new String("NLU");
//		list1.add(s1);
//		list1.add(s2);
//		System.out.println(list1.contains(s1));
//		System.out.println(list1.contains(s3));
		
//		List<Student> list2 = new ArrayList<Student>();
//		Student st1 = new Student("001", "An", "Nguyen", 2002, 7.8);
//		Student st2 = new Student("002", "Nam", "Nguyen", 2002, 9.8);
//		Student st3 = new Student("001", "An", "Nguyen", 2002, 7.8);
//		list2.add(st1);
//		list2.add(st2);
//		Collections.shuffle(list2);
//		System.out.println(list2.contains(st1));
//		System.out.println(list2.contains(st3));
		
		System.out.println("ver 2");
		Student st11 = new Student("22130088", "Hoang", "Phan", 2004, 9.0);
		Student st12 = st11;
		Student st13 = new Student("22130088", "Hoang", "Phan", 2004, 9.0);
		System.out.println(st11 == st12);
		System.out.println(st11 == st13);
		System.out.println(st11.equals(st12));
		System.out.println(st11.equals(st13));
	}
}
