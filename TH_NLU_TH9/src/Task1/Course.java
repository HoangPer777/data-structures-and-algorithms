package Task1;

import java.util.ArrayList;

public class Course {
	String id;
	String title;
	String type;
	ArrayList<Student> listStudent = new ArrayList<Student>();
	String lecturer;

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", type=" + type + ", listStudent=" + listStudent
				+ ", lecturer=" + lecturer + "]";
	}

	public Course(String id, String title, String type, ArrayList<Student> listStudent, String lecturer) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.listStudent = listStudent;
		this.lecturer = lecturer;
	}

}
