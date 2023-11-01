package Task1;

public class WordCount {

	public String word;
	public int count;
	
	public WordCount(String word, int count) {
		this.word = word;
		this.count = count;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + word.hashCode();
		result = prime * result + count;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
//		System.out.println("called.");
		
		if (obj == null || obj.getClass() != getClass())
			return false;
		else {
			WordCount c = (WordCount) obj;
			return this.word.equals(c.word);
		}
	}
	

	public void setWord(String word) {
		this.word = word;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return this.word + "-" + this.count;
	}
}
