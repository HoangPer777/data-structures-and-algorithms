package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class TestReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		// Scanner input = new Scanner(new File("data/hamlet.txt"));
		List<String> data = new ArrayList<String>();
		Scanner input = new Scanner(new File("D:\\aaa\\WorkSpace_21\\TH_NLU_TH7\\src\\Task2\\fit.txt"));

		while (input.hasNext()) {
			String word = input.next();
//			System.out.println(word);
			data.add(word);
		}

		Even evenPredicates = new Even();
		List<Integer> numbers = new ArrayList<>();
		for (String word : data) {
			numbers.add(Integer.parseInt(word));
		}

//      MyPredicates.remove(numbers , evenPredicates);
//		MyPredicates.retain(numbers, evenPredicates);
//		System.out.println(numbers);
//		System.out.println(MyPredicates.collect(numbers, evenPredicates).toString());
		System.out.println(MyPredicates.find(numbers, evenPredicates));

	}
}