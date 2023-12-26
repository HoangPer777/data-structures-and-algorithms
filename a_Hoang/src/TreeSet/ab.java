package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class ab {
	public static void main(String[] args) {
		Student st1 = new Student("Nam", 10);
		Student st2 = new Student("Anh", 12);
		Student st3 = new Student("Tam");
		TreeSet<Student> q = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		
		});
		q.add(st1);
		q.add(st2);
		q.add(st3);
		st3.setAge(13);
		System.out.println(q.toString());
	}
}
