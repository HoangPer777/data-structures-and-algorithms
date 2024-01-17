package Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListBook {
	List<ABook> books = new ArrayList<ABook>();

	public void add(ABook book) {
		books.add(book);
	}

//	Phương thức xác định loại của ấn phẩm (Tạp chí hay Sách tham khảo) - <dựa trên index> 
	public String whatType(int position) {
		return books.get(position).whatType();
	}

//	Phương thức kiểm tra ấn phẩm là tạp chí và có thời gian xuất bản cách đây
//	(2023) 10 năm hay không
	public boolean magazineIs10Ago(int position) {
		return books.get(position).magazineIs10Ago();		
//		return (2023 - books.get(position).pushlistYear) >= 10;
	}

//	Phương thức kiểm tra hai ấn phẩm có cùng loại và cùng tác giả hay không
	public boolean isBookSame(int position1 , int position2) {
		if(!books.get(position1).whatType().equals(books.get(position2).whatType())) {
			return false;
		}
		return books.get(position1).author.equals(books.get(position2).author);
		
	}
	
//	Tính tổng tiền của tất các ấn phẩm trong nhà sách
	public int totalPrice() {
		int totalPrice = 0;
		for (ABook book : books) {
			totalPrice += book.getPrice();
		}
		return totalPrice;
	}
	
//	Tìm quyển sách tham khảo có chương sách nhiều trang nhất 
	public ABook referenceMostPage() {
		int mostPage = 0;
		ABook result = null;
		for(int i = 0; i < books.size(); i++) {
			if(whatType(i).equals("Reference")) {
				if(books.get(i).getPageNum() > mostPage) {
					mostPage = books.get(i).getPageNum();
					result = books.get(i);
				}
			}
			
		}
		return result;		
	}
	
//	Tìm xem trong danh sách các ấn phẩm có chứa một tạp chí có tên cho trước hay không?
	public boolean search(String title) {
		for(ABook book : books) {
			if(book.search(title)) {
				System.out.println("\n"+ book.toString());
				return true;	
			}		
		}
		
		return false;	
	}
	
//	Lấy ra danh sách các tạp chí được xuất bản vào 1 năm cho trước 
	public List<ABook> listBook_Year(int year){
		List<ABook> result = new ArrayList<ABook>();
		for(ABook book: books ) {
			if(book.isYear(year)) {
				result.add(book);
			}	
		}	
		return result;		
	}
	
//	Sắp xếp ấn phẩm tăng dần theo tiêu đề và giảm dần theo năm xuất bản (sử
//	dụng interface Comparable hoặc Comparator)
	public List<ABook> sort(){
		List<ABook> result = new ArrayList<ABook>();
		result.addAll(books);	
		Comparator<ABook> byName_pushlistYear = new Comparator<ABook>() {		
			@Override
			public int compare(ABook o1, ABook o2) {
				if(o1.title.equals(o2.title)) {
					return -(o1.pushlistYear - o2.pushlistYear);
				}
				return o1.title.compareTo(o2.title);
			}
		};
		result.sort(byName_pushlistYear);
		
//		result.sort((o1, o2) -> (o1.getPushlistYear() == o2.getPushlistYear()) ? (o1.getPushlistYear() - o2.getPushlistYear()): (o1.getTitle().compareTo(o2.getTitle())));
//		result.sort(Comparator.comparing(ABook :: getPushlistYear).thenComparing(ABook :: getTitle));
		return result;
	}
	
	
//	Thống kê số lượng ấn phẩm theo năm xuất bản. Ví dụ 2020: 5, 2021: 10, …
//	năm 2020 có 5 ấn phẩm, năm 2021 có 10 ấn phẩm
	public Map<Integer, Integer> statistical(){
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for(ABook book : books) {
			if(result.containsKey(book.pushlistYear)) {
				result.put(book.pushlistYear, result.get(book.pushlistYear) + 1);	
			}else {
				result.put(book.pushlistYear, 1);
			}
		}
		return result;
	}
	
}
