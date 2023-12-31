package app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Clazz {
	private String name;
	private String year;// 2017, 2018, 2019, ...
	public ArrayList<Student> students = new ArrayList<Student>();

	public Clazz(String name, String year) {
		this.name = name;
		this.year = year;
	}

	Comparator<Student> byGPA = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return -(Double.compare(o1.getGPA(), o2.getGPA()));
		}
	};
	Comparator<Student> byFirstName = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
	};
	Comparator<Student> byLastName = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getLastName().compareTo(o2.getLastName());
		}
	};
//	Comparator<Student> byID = new Comparator<Student>() {
//		@Override
//		public int compare(Student o1, Student o2) {
//			// TODO Auto-generated method stub
//			return o1.getId().compareTo(o2.getId());
//		}
//	};
	Comparator<Student> byID = (o1, o2) -> o1.getId().compareTo(o2.getId());

	Comparator<Student> byBirthYear = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getBirthYear() - o2.getBirthYear();
		}
	};
	
	// sort students according to the given comparator c
	public void sortStudents(Comparator<Student> c ) {
//		students.sort(byGPA);
		Collections.sort(students, byGPA);


	}

	// get top n students with highest GPA
	public ArrayList<Student> getTopNStudents(int n) {
		sortStudents(byGPA);
		ArrayList<Student> topN = new ArrayList<Student>();
		for (int i = 0; i < n; i++) {
			topN.add(students.get(i));
		}
		return topN;
	}

	// get random n students from the list of students
	public ArrayList<Student> getRandomNStudents(int n) {
		ArrayList<Student> ListRandomNStudents = new ArrayList<Student>();
		ArrayList<Student> ListRandomNStudents2 = new ArrayList<Student>();
		ListRandomNStudents.addAll(students);
		Collections.shuffle(ListRandomNStudents);
		for(int i = 0; i < n; i++) {
			ListRandomNStudents2.add(ListRandomNStudents.get(i));
		}
//		ListRandomNStudents.addAll(ListRandomNStudents.size() - n, ListRandomNStudents);
		return ListRandomNStudents2;
	}

// remove a student with a given id
	public boolean removeStudent(String id) {
		for (Student student : students) {
			if(Student.isStudentEqual_ID(student, id)) {
				students.remove(student);
				return true;
			}
		}
//		ko oop
//		for (int i = 0; i < students.size(); i++) {
//			if (id.equals(students.get(i).getId())) {
//				students.remove(i);
//				return true;
//			}
//		}
		return false;
	}

	// get all students who were born in a given birth year.
	public ArrayList<Student> getStudentByBirthYear(int birthYear) {
		ArrayList<Student> listStudentByYear = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (birthYear == students.get(i).getBirthYear()) {
				listStudentByYear.add(students.get(i));
			}
		}
		return listStudentByYear;
	}

	// similar as toString method, this method prints the name, year, and all
	// students of the class. Note that, using iterator
	public void display() {
		Iterator<Student> iList = students.iterator();
		while (iList.hasNext()) {
			System.out.println(iList.next());
		}
	}

}
