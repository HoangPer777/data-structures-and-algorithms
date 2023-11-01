package Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
	public static List<String> loadWords(String fileName) throws FileNotFoundException {
		List<String> re = new ArrayList<String>();
		Scanner input = new Scanner(new File("D:\\aaa\\WorkSpace_21\\TH_NLU_TH7\\src\\Task1\\fit.txt"));

		while (input.hasNext()) {
			String word = input.next();
			re.add(word);
		}
		
		return re;
	}

	public static void main(String[] args) {
		MyWordCount WordCountClass = new MyWordCount();	
//		System.out.println(WordCountClass.getWordCounts().toString());
//		System.out.println(WordCountClass.getUniqueWords().toString());
//		System.out.println(WordCountClass.getDistinctWords().toString());
//		System.out.println(WordCountClass.printWordCounts().toString());
//		System.out.println(WordCountClass.exportWordCountsByOccurence().toString());
		System.out.println(WordCountClass.filterWords("D").toString());
		
//		try {
//
//			List<String> wordss = Utils.loadWords("D:\\aaa\\WorkSpace_21\\TH_NLU_TH7\\src\\Task1\\fit.txt");			
//
//			MyWordCount WordCountClass = new MyWordCount();	
//
//			System.out.println(WordCountClass.getWordCounts().toString());
//		
////	    System.out.println(WordCountClass.getUniqueWords().toString());
//
////	            for (String word : wordss) {
////	                System.out.print(word + " ");
////	            }
//
//		} catch (FileNotFoundException e) {
//			System.err.println("Lỗi: Tệp không tồn tại.");
//
//		}
	}
}
