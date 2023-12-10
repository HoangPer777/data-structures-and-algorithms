package Task2;

public abstract class ABook {
	protected String title;
	protected int pageNum;
	protected int pushlistYear;
	protected String author;
	protected int price;
	public ABook(String title, int pageNum, int pushlistYear, String author, int price) {
		super();
		this.title = title;
		this.pageNum = pageNum;
		this.pushlistYear = pushlistYear;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title + ", page=" + pageNum + ", pushlistYear=" + pushlistYear + "\n";
	}

	public int getPageNum() {
		return pageNum;
	}

	public void getAuthor(String author) {
		this.author = author;
	}
	public int getPushlistYear() {
		return pushlistYear;
	}
	
	public int getPrice() {
		return price;
	}


	public abstract String whatType();

	protected abstract boolean magazineIs10Ago();

	public boolean search(String title) {	
		return title.equals(title);
		
	}

	public boolean isYear(int year) {	
		return pushlistYear == year;	
	}

	


	
	
	
	
	
	
}
