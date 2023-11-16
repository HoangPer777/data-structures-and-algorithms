package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Faculty {
	String name;
	String address;
	ArrayList<Course> listCourse = new ArrayList<Course>();

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", address=" + address + ", listCourse=" + listCourse + "]";
	}

	public Faculty(String name, String address, ArrayList<Course> listCourse) {
		super();
		this.name = name;
		this.address = address;
		this.listCourse = listCourse;
	}

//	trả về course thực hành có nhiều sinh viên đăng ký học nhất
	public Course getMaxPracticalCourse() {
		Course courseMax = null;
		int maxStudent = 0;
		for (Course course : listCourse) {
			if(course.type.equals("Thuc hanh")) {
				if(course.listStudent.size() > maxStudent) {
					courseMax = course;
					maxStudent = course.listStudent.size();
				}
			}
		}
		return courseMax;
	}

//	 để thống kê danh sách sinh viên theo năm vào học, với key là năm vào học và
//	 value là các sinh viên tương ứng
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> groupStudentsByYear = new HashMap<Integer, List<Student>>();

		for (Course course : listCourse) {
			for (Student student : course.listStudent) {
				if (groupStudentsByYear.containsKey(student.year)) {
					groupStudentsByYear.get(student.year).add(student);
				} else {
					List<Student> listStudent = new ArrayList<Student>();
					listStudent.add(student);
					groupStudentsByYear.put(student.year, listStudent);
				}
			}
		}

		return groupStudentsByYear;

	}

//	 trả về các course theo loại cho trước (type). Các course được sắp xếp giảm 
//	 dần theo số lượng sinh viên đăng ký học.

	public Set<Course> filterCourses(String type) {
//		Comparator<Course> byQuantityStudent = new Comparator<Course>() {
//			@Override
//			public int compare(Course o1, Course o2) {
//				return -(o1.listStudent.size() - o2.listStudent.size());
//			}
//		};
//		TreeSet<Course> result = new TreeSet<Course>(byQuantityStudent);
//		for(Course course : listCourse) {
//			if(course.type.equals(type)) {
//				result.add(course);
//			}
//		}
//		return result;

		Comparator<Course> byQuantityStudent = new Comparator<Course>() {
			@Override
			public int compare(Course o1, Course o2) {
				// TODO Auto-generated method stub
				return -(o1.listStudent.size() - o2.listStudent.size());
			}
		};
		SortedSet<Course> result = new TreeSet<Course>(byQuantityStudent);
		for (Course course : listCourse) {
			if (course.type.equals(type)) {
				result.add(course);
			}
		}

		return result;
	}
}
