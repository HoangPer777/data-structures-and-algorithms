package Task3;

import java.util.ArrayList;
import java.util.List;

class LibraryTest {

	public static void main(String[] args) {
		
		Author author1 = new Author("a", 1999);
		Author author2 = new Author("b", 2000);
		Author author3 = new Author("c", 2001);
		Author author4 = new Author("d", 1890);
		Author author5 = new Author("e", 1930);
		List<Author> listAuthor1 = new ArrayList<Author>();
		listAuthor1.add(author1);
		listAuthor1.add(author2);
		listAuthor1.add(author3);
		listAuthor1.add(author4);
		listAuthor1.add(author5);
		Book book1 = new Book("01", "aOkie", 10, "tho", 2015, listAuthor1);
		
		Author author6 = new Author("f", 1891);
		Author author7 = new Author("g", 1895);
		Author author8 = new Author("h", 1934);
		List<Author> listAuthor2 = new ArrayList<Author>();
		listAuthor2.add(author6);
		listAuthor2.add(author7);
		listAuthor2.add(author8);
		Book book2 = new Book("02", "haha", 15, "truyen", 2017, listAuthor2);
		
		Author author9 = new Author("h", 1934);
		List<Author> listAuthor3 = new ArrayList<Author>();
		listAuthor3.add(author9);
		Book book3 = new Book("03", "hayLam", 22, "kich", 2021, listAuthor3);
		
		List<Book> listBooks = new ArrayList<Book>();
		Library library = new Library("Hoang", listBooks);
		listBooks.add(book1);
		listBooks.add(book2);
		listBooks.add(book3);
		
		System.out.println(library.getOldestBook().toString());
		System.out.println(library.getBooksByYears());
		System.out.println();
		System.out.println(library.findBooks("h", 2021).toString());
	}

}
