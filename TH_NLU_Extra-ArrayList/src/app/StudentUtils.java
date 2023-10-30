package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.naming.spi.DirStateFactory.Result;

public class StudentUtils {
	// read the content of a text file
	public static ArrayList<Student> loadStudents(String students) throws IOException {
		ArrayList<Student> result = new ArrayList<Student>();
		BufferedReader reader = new BufferedReader(new FileReader(students));
		String line = null;
		while (true) {
			line = reader.readLine();
			if (line == null)
				break;
			StringTokenizer tokens = new StringTokenizer(line, "\t");
			String id = tokens.nextToken();
			String firstName = tokens.nextToken();
			String lastName = tokens.nextToken();
			int birthYear = Integer.parseInt(tokens.nextToken());
			double GPA = Double.parseDouble(tokens.nextToken());
			result.add(new Student(id, firstName, lastName, birthYear, GPA));
		}
		reader.close();
		return result;
	}

	public static void main(String[] args) throws IOException {
		try {
			String filePath = "D:\\aaa\\WorkSpace_21\\TH_NLU_Extra-ArrayList\\src\\app\\students.txt";
			ArrayList<Student> studentss = StudentUtils.loadStudents(filePath);
			
			Clazz studentClazz = new Clazz(filePath, filePath);
			studentClazz.students.addAll(studentss);
			
//			test method
//			System.out.println(studentClazz.getStudentByBirthYear(1997).toString()); // ok - non_oop
//			studentClazz.removeStudent("18130090"); // ok oop
//			System.out.println(studentClazz.getRandomNStudents(3).toString()); // ok - costly_Stack
//			studentClazz.sortStudents(studentClazz.byGPA); // ok
			System.out.println(studentClazz.getTopNStudents(3).toString()); // ok

//			display
//			for (Student student : studentClazz.students) {
//				System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " " + student.getGPA());
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
