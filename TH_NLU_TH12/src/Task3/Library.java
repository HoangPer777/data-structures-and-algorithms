package Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Library {
	private String name;
	private List<Book> books = new ArrayList<>();

	public Library(String name, List<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", books=" + books + "]";
	}

	// trả về quyển sách được xuất bản lâu nhất.
	public Book getOldestBook() {
		Book oldestBook = books.get(0);
		int oldYear = books.get(0).getYear();
		for (Book book : books) {
			if (book.getYear() < oldYear) {
				oldestBook = book;
				oldYear = book.getYear();
			}
		}
		return oldestBook;
	}

	public Map<String, Integer> thongke() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		for(Book book : books){
			if(result.containsKey(book.getType())){
			result.put(book.getType(), result.get(book.getType()) + 1);
			}else{
				result.put(book.getType(),  1);
			}
		}
		return result;

	}

//	để thống kê các quyển sách theo năm, với key là năm xuất bản và 
//	value là các quyển sách xuất bản trong năm đó.
	public Map<Integer, List<Book>> getBooksByYears() {

		Map<Integer, List<Book>> result = new HashMap<Integer, List<Book>>();
		for (Book book : books) {
			if (!result.containsKey(book.getYear())) {
				result.put(book.getYear(), new ArrayList<Book>());
				result.get(book.getYear()).add(book);
			} else {
				result.get(book.getYear()).add(book);
			}
		}
		return result;
	}

//	trả về các quyển sách có năm xuất bản là tham số year và tên tác giả là 
//	tham số authorName. Các quyển sách được sắp xếp theo thứ tự bảng chữ cái 
//	của tiêu đề
	public Set<Book> findBooks(String authorName, int year) {
		Comparator<Book> byName = new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getTitle().compareTo(o2.getTitle());
			}
		};
		Set<Book> result = new TreeSet<Book>(byName);
		for (Book book : books) {
			if ((book.getYear() == year)) {
				if (similarAuthor(book, authorName)) {
					result.add(book);
				}

			}
		}
		return result;
	}

	public boolean similarAuthor(Book book, String authorName) {
		return book.similarAuthor(book, authorName);
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(2);
		System.out.println(list);

	}
}
