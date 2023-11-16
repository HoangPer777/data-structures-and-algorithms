package Task2;

import java.util.ArrayList;
import java.util.List;

public class Reference  extends ABook{
	private String type;
	private List<Chapter> listChapter = new ArrayList<Chapter>();
	public Reference(String title, int pageNum, int pushlistYear, String author, int price, String type,
			List<Chapter> listChapter) {
		super(title, pageNum, pushlistYear, author, price);
		this.type = type;
		this.listChapter = listChapter;
	}
	@Override
	public String whatType() {
		// TODO Auto-generated method stub
		return "Reference";
	}
//	@Override
//	public boolean magazineIs10Ago() {
//		// TODO Auto-generated method stub
//		return false;
//	}
	@Override
	protected boolean magazineIs10Ago() {
		// TODO Auto-generated method stub
		return false;
	}


}
