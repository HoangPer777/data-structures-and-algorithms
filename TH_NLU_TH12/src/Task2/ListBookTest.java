package Task2;

import java.util.ArrayList;
import java.util.List;

class ListBookTest {

	public static void main(String[] args) {
		Magazine magazine0 = new Magazine("TieuDe0", 100, 2023, "Hoang", 10, "tapChi1");
		Magazine magazine1 = new Magazine("TieuDe1", 100, 2023, "Hoang", 10, "tapChi1");
		Magazine magazine2 = new Magazine("TieuDe2", 200, 2021, "Hai", 12, "tapChi2");
		Magazine magazine3 = new Magazine("TieuDe4", 300, 2020, "Long", 20, "tapChi3");
		Magazine magazine4 = new Magazine("TieuDe4", 400, 2023, "Phong", 3, "tapChi4");
		
		
		
		List<Chapter> listChapter0 = new ArrayList<Chapter>();
		List<Chapter> listChapter1 = new ArrayList<Chapter>();
		List<Chapter> listChapter2 = new ArrayList<Chapter>();
		List<Chapter> listChapter3 = new ArrayList<Chapter>();
		List<Chapter> listChapter4 = new ArrayList<Chapter>();	
		Reference reference5 = new Reference("Toan", 320, 2015, "Kien", 10, "y hoc", listChapter0 );
		Reference reference6 = new Reference("Dia", 120, 2015, "Huy", 10, "y hoc", listChapter1 );
		Reference reference7 = new Reference("Ly", 7040, 2016, "Bao", 10, "The thao", listChapter2 );
		Reference reference8 = new Reference("Hoa", 2002, 2016, "Doanh", 10, "Giao duc", listChapter3 );
		Reference reference9 = new Reference("Sinh", 2200, 2016, "Liem", 10, "Giao duc", listChapter4 );
		
		ListBook listBook = new ListBook();
		listBook.books.add(magazine0);
		listBook.books.add(magazine1);
		listBook.books.add(magazine2);
		listBook.books.add(magazine3);
		listBook.books.add(magazine4);
		listBook.books.add(reference5);
		listBook.books.add(reference6);
		listBook.books.add(reference7);
		listBook.books.add(reference8);
		listBook.books.add(reference9);
		System.out.println(listBook.whatType(0));
		
		System.out.println(listBook.magazineIs10Ago(4));
		System.out.println(listBook.magazineIs10Ago(0));
		
		System.out.println("isBookSame: "+listBook.isBookSame(0, 1));
		System.out.println("isBookSame: "+listBook.isBookSame(1, 2));
		System.out.println("isBookSame: "+listBook.isBookSame(1, 7));
		
		System.out.println("totalPrice: " + listBook.totalPrice());
		
		System.out.println(listBook.referenceMostPage().toString());
		
		System.out.println(listBook.search("search book"+"TieudDe1"));
		
		System.out.println(listBook.listBook_Year(2023));
		
		System.out.println("Sort: ");
		System.out.println(listBook.sort());
		
		System.out.println(listBook.statistical().toString());
		
	}

}
