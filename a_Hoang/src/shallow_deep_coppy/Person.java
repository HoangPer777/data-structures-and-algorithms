package shallow_deep_coppy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person implements Cloneable {
	private String id;
	private String name;

	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("001", "Binh");
		Person p2 = new Person("002", "An");
		Person p3 = new Person("003", "Mai");

		Person[] contacts = { p1, p2, p3 };
//		Person[] guests = new Person[contacts.length];
		Person[] guests = contacts.clone();
//		for(int i = 0; i < contacts.length;i++) {
//			guests[i] = (Person) contacts[i].clone();
//		}
		contacts[0].setName("Tam");

		System.out.println(Arrays.toString(contacts));
		System.out.println(Arrays.toString(guests));

//		String s1 = new String("hoang");
//		String s2 = new String("hoang");
//		Double d = 9.0;
//		float f = 9.0f;
//		System.out.println(s1 == s2); //toán tử == so sánh xem hai biến 
////		tham chiếu có trỏ đến cùng một đối tượng không
//		System.out.println(s1.equals(s2)); //.equals() là phương thức trong Java
////		để so sánh giá trị của hai đối tượng
//		System.out.println(d == f);
//		System.out.println(d.equals(f));

//		String a = "a", b = "b", zero = "";
//		Integer c = new Integer(0);
////		int c = 0;
//		String d = ((a + b) + c);
//		System.out.println(!((a + b) + c).equals(a + (b + c)));
//		System.out.println((c + zero).equals(zero + c));
//		System.out.println((a+ null).equals(a + "null"));
//		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		for(int i = 0; i < list.size();i++) {
			list.remove(i);
		}
		System.out.println(list);
	}
}
