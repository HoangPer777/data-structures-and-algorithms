package Task1_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import Task2.ABook;

public class Faculty {
	private String name;
	private String address;
	private ArrayList<Course> listCourse = new ArrayList<Course>();

	@Override
	public String toString() {
		return "Faculty [name=" + name  + "\n";
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
		String type = "Thuc hanh";
		for (Course course : listCourse) {
			if(course.isType(type)) {
				if(course.getListStudent().size() > maxStudent) {
					maxStudent = course.getListStudent().size();
					courseMax = course;
				}
				
			}
		}
		return courseMax;
	}

//	 để thống kê danh sách sinh viên theo năm vào học, với key là năm vào học và
//	 value là các sinh viên tương ứng
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> result = new TreeMap<Integer, List<Student>>();

		for (Course course : this.listCourse) {
			for (Student student : course.getListStudent()) {
				int year = student.getYear();
				if (result.containsKey(year)) {
					result.get(year).add(student);
				} else {
					ArrayList<Student> value = new ArrayList<Student>();
					value.add(student);
					result.put(year, value);
				}
			}
		}
		return result;
	}

//	 trả về các course theo loại cho trước (type). Các course được sắp xếp giảm 
//	 dần theo số lượng sinh viên đăng ký học.
	public Set<Course> filterCourses(String type) {	
		Comparator<Course> byQuantityStudent = new Comparator<Course>() {
			@Override
			public int compare(Course o1, Course o2) {
				return -(o1.getListStudent().size() - o2.getListStudent().size());
			}
		};
		TreeSet<Course> result = new TreeSet<Course>(byQuantityStudent);
		for(Course course : listCourse) {
			if(course.isType(type)) {
				result.add(course);
			}
		}
		return result;

	}

	
}
