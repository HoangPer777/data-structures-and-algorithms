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
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) throws IOException {
		loadStudents("student.txt");
	}
}
