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
			String filePath = "D:\\aaa\\WorkSpace_21\\TH_NLU_TH7\\src\\app\\students.txt";
			ArrayList<Student> students = StudentUtils.loadStudents(filePath);

			Clazz studentClass = new Clazz("YourClassName", "YourYear");

			studentClass.students.addAll(students);

//			studentClass.sortStudents(studentClass.byGPA);
			studentClass.sortStudents(studentClass.byGPA);
			ArrayList<Student> topStudents = studentClass.getTopNStudents(5);

			for (Student student : topStudents) {
				System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " " + student.getGPA());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
