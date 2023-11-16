package Task2;

public class Magazine extends ABook {
	private String name;

	public Magazine(String title, int pageNum, int pushlistYear, String author, int price, String name) {
		super(title, pageNum, pushlistYear, author, price);
		this.name = name;
	}

	@Override
	public String whatType() {
		// TODO Auto-generated method stub
		return "Magazine";
	}

	public boolean magazineIs10Ago() {
		int thisYear = 2023;
		return (thisYear - pushlistYear)  >= 10;
	}


	
}
