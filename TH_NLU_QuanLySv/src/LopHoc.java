import java.util.ArrayList;
import java.util.List;

public class LopHoc {
	private String maLop;
	private int khoa;
	private List<SinhVien> dssv = new ArrayList<>();

	public LopHoc(String maLop, int khoa, List<SinhVien> dssv) {
		super();
		this.maLop = maLop;
		this.khoa = khoa;
		this.dssv = dssv;
	}
	
	
	public String getMaLop() {
		return maLop;
	}


	public int getKhoa() {
		return khoa;
	}


	public List<SinhVien> getDssv() {
		return dssv;
	}


	public void add(SinhVien sv) {
		this.dssv.add(sv);
	}
}