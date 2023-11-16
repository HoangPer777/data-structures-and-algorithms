package Task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FacultyTest {

	public static void main(String[] args) {

		Student student0 = new Student("1", "Hoai", 2023);
		Student student1 = new Student("2", "Nam", 2023);
		Student student2 = new Student("3", "Mai", 2022);
		Student student3 = new Student("4", "Anh", 2021);
		Student student4 = new Student("5", "Hoa", 2020);
		Student student5 = new Student("6", "Binh", 2020);
		Student student6 = new Student("7", "Quan", 2022);
		Student student7 = new Student("8", "Huong", 2022);
		Student student8 = new Student("9", "Linh", 2022);
		Student student9 = new Student("10", "Tuan", 2022);
		
		ArrayList<Student> listStudent = new ArrayList<Student>();
		Course course = new Course("101", "CTDL", "Thuc hanh", listStudent, "Du");
		course.listStudent.add(student0);
		course.listStudent.add(student1);
		course.listStudent.add(student2);
		course.listStudent.add(student3);
		course.listStudent.add(student4);
		course.listStudent.add(student5);
		course.listStudent.add(student6);
		course.listStudent.add(student7);
		course.listStudent.add(student8);
		course.listStudent.add(student9);
		
		ArrayList<Student> listStudent2 = new ArrayList<Student>();
		Course course2 = new Course("102", "CTDL", "Ly thuyet", listStudent2, "Du");
		Student student10 = new Student("1", "Hoang", 2022);
		Student student11 = new Student("2", "Hai", 2023);
		Student student12 = new Student("3", "Hiep", 2023);
		Student student13 = new Student("4", "Hieu", 2021);
		Student student14 = new Student("5", "Vinh", 2023);
		Student student15 = new Student("6", "Binh", 2022);
		Student student16 = new Student("7", "Quan", 2019);
		Student student17 = new Student("8", "Huong", 2023);
		Student student18 = new Student("9", "Loan", 2022);
		Student student19 = new Student("10", "Huong", 2023);
		Student student20 = new Student("11", "Hoa", 2023);
		
		course2.listStudent.add(student10);
		course2.listStudent.add(student11);
		course2.listStudent.add(student12);
		course2.listStudent.add(student13);
		course2.listStudent.add(student14);
		course2.listStudent.add(student15);
		course2.listStudent.add(student16);
		course2.listStudent.add(student17);
		course2.listStudent.add(student18);
		course2.listStudent.add(student19);
		course2.listStudent.add(student20);
		
		
		Student student21 = new Student("2", "Nam", 2023);
		Student student22 = new Student("3", "Lien", 2022);
		Student student23 = new Student("4", "Anh", 2021);
		Student student24 = new Student("5", "Hoa", 2020);
		Student student25 = new Student("6", "Hoang", 2020);
		ArrayList<Student> listStudent3 = new ArrayList<Student>();
		Course course3 = new Course("103", "ToanRR", "Ly thuyet", listStudent3, "Tram");
		course3.listStudent.add(student21);
		course3.listStudent.add(student22);
		course3.listStudent.add(student23);
		course3.listStudent.add(student24);
		course3.listStudent.add(student25);


		ArrayList<Course> listCourse = new ArrayList<Course>();
		listCourse.add(course);
		listCourse.add(course2);
		

		Faculty faculty = new Faculty("FIT", "HCMC", listCourse);
//		System.out.println(faculty);
//		System.out.println(faculty.getMaxPracticalCourse());
//		System.out.println(faculty.groupStudentsByYear());
		System.out.println(faculty.filterCourses("Ly thuyet"));
	}

}
