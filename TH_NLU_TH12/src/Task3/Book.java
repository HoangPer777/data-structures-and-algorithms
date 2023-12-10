package Task3;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String id;
	private String title;
	private int price;
	private String type;
	private int year;
	private List<Author> authors = new ArrayList<>();
	public Book(String id, String title, int price, String type, int year, List<Author> authors) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.type = type;
		this.year = year;
		this.authors = authors;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id +   ", year=" + year
				+ ", authors=" + authors + "]"+ "\n";
	}

	public int getYear() {
		return year;
	}

	public String getTitle() {
		return title;
	}


	public boolean similarAuthor(Book book, String authorName) {
		// TODO Auto-generated method stub
		for(Author author: authors) {
			if(author.getName().equals(authorName)) {
				return true;
			}
		}
		return false;
	}

	
	
}
