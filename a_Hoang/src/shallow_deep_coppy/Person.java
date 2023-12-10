package shallow_deep_coppy;

import java.util.Arrays;

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

	}
}
