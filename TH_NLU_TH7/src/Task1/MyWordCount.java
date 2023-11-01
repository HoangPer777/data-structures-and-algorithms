package Task1;

import java.io.FileNotFoundException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.lang.model.element.Element;

public class MyWordCount {
//	public static final String fileName = "data/hamlet.txt";
//	public static final String fileName = "D:\\aaa\\WorkSpace_21\\TH_NLU_TH7\\src\\Task1\\hamlet.txt";
//	public static final String fileName = "data/fit.txt";
	public static final String fileName = "D:\\aaa\\WorkSpace_21\\TH_NLU_TH7\\src\\Task1\\fit.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCount() {

		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public List<WordCount> getWordCounts() {
		List<WordCount> re = new ArrayList<WordCount>();

		for (String word : words) {
			boolean status = true;
			for (WordCount wc : re) {
				if (wc.getWord().equals(word)) {
					wc.setCount(wc.getCount() + 1);
					re.remove(new WordCount(wc.getWord(), wc.getCount()));

					re.add(new WordCount(wc.getWord(), wc.getCount()));
					status = false;
					break;
				}

			}
			if (status) {
				re.add(new WordCount(word, 1));
			}
		}
		return re;

//		Map<String, Integer> wordCountMap = new HashMap<>();
//		for (String element : words) {
//			if(wordCountMap.containsKey(element)) {
//				int count = wordCountMap.get(element);
//				wordCountMap.put(element, count + 1);
//			}else {
//				wordCountMap.put(element, 1);
//			}
//		}
////		display
//		List<WordCount> wordCounts = new ArrayList<WordCount>();
//		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
//			wordCounts.add(new WordCount(entry.getKey(), entry.getValue()));
//		}
//		
//		return wordCounts;

	}

	// Returns the words that their appearance are 1, do not consider duplidated
	// words
	public Set<String> getUniqueWords() {
		Set<String> result = new HashSet<String>();

		List<WordCount> count = new ArrayList<WordCount>();
		count = getWordCounts();
		for (WordCount word : count) {
			if (word.getCount() == 1) {
				result.add(word.getWord());
			}
		}

		return result;
//		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
//		for (String element : words) {
//			if (wordCountMap.containsKey(element)) {
//				int count = wordCountMap.get(element);
//				wordCountMap.put(element, count);
//			} else {
//				wordCountMap.put(element, 1);
//			}
//		}
//		Set<String> result = new HashSet<String>();
//		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
//			if (entry.getValue() == 1) {
//				result.add(entry.getKey());
//			}
//
//		}
//		return result;
	}

	// Returns the words in the text file, duplicated words appear once in the
	// result
	public Set<String> getDistinctWords() {
		Set<String> result = new HashSet<String>();
		for (String word : words) {
			result.add(word);
		}
//		List<WordCount> wc = new ArrayList<WordCount>();
//		wc = getWordCounts();
//		for (WordCount wordCount : wc) {
//			result.add(wordCount.getWord());
//		}

		return result;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public Set<WordCount> printWordCounts() {
		TreeSet<WordCount> treeSet = new TreeSet<WordCount>(byAppear_word);

		treeSet.addAll(getWordCounts());

		return treeSet;
		
		
	}
	Comparator<WordCount> byAppear_word = new Comparator<WordCount>() {
		@Override
		public int compare(WordCount o1, WordCount o2) {
			return ((o1.count != o2.count) ? (o1.count - o2.count) : o1.word.compareTo(o2.word));

		}

	};

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according descending order of occurences
	// Example: Bug - 10, An - 3, Nam - 2.
	public Set<WordCount> exportWordCountsByOccurence() {
		TreeSet<WordCount> treeSet = new TreeSet<WordCount>(new Comparator<WordCount>() {
			@Override
			public int compare(WordCount o1, WordCount o2) {
				// TODO Auto-generated method stub
				return -((o1.count != o2.count) ? (o1.count - o2.count) : o1.word.compareTo(o2.word));
			}
			
		});

		treeSet.addAll(getWordCounts());
		return treeSet;
	}

	// delete words begining with the given pattern (i.e., delete words begin with
	// 'A' letter
	public Set<String> filterWords(String pattern) {
		Set<String> result = new HashSet<String>();
		for (String word : words) {
			if(!word.substring(0, pattern.length()).equals(pattern)) {
				result.add(word);
			}
		}
		return result;
	}
}
