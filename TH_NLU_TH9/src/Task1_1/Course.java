package Task1_1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
	private String id;
	private String title;
	private String type;
	private ArrayList<Student> listStudent = new ArrayList<Student>();
	private String lecturer;

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	@Override
	public String toString() {
		return id + " " + title + " " + type + ", listStudent=" + listStudent ;
	}

	public Course(String id, String title, String type, ArrayList<Student> listStudent, String lecturer) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.listStudent = listStudent;
		this.lecturer = lecturer;
	}

	public void add(Student student) {
		listStudent.add(student);
	}

	public boolean isType(String type) {
		return this.type.equals(type);
	}	

	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Course course = (Course) obj;
        return Objects.equals(id, course.id) && Objects.equals(title, course.title)
                && Objects.equals(type, course.type) && Objects.equals(lecturer, course.lecturer)
                && Objects.equals(listStudent, course.listStudent);
        // So sánh các trường dữ liệu quan trọng để xác định đối tượng giống nhau
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, type, listStudent, lecturer);
        // Tính toán giá trị hash dựa trên các trường dữ liệu quan trọng
    }
    
	

}
