import java.util.ArrayList;
import java.util.List;

public class GiangVien {
	private String hoTen;
	private int namSinh;
	private List<MonHoc> dsMonHoc = new ArrayList<>();
	
	public GiangVien(String hoTen, int namSinh, List<MonHoc> dsMonHoc) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.dsMonHoc = dsMonHoc;
	}

	public List<MonHoc> getDsMonHoc() {
		return dsMonHoc;
	}

	@Override
	public String toString() {
		return "GiangVien [hoTen=" + hoTen + ", namSinh=" + namSinh + ", dsMonHoc=" + dsMonHoc + "]" + "\n";
	}

	public String getHoTen() {
		return hoTen;
	}
	
	public void add(MonHoc monhoc) {
		dsMonHoc.add(monhoc);
	}
	
	public int tongSoTinChi() {
		int sum = 0;
		for(MonHoc monHoc : dsMonHoc) {
			sum += monHoc.getSoTinChi();
		}
		return sum;
	}
	public List<MonHoc> getMonHoc(String loai) {
		List<MonHoc> result = new ArrayList<>();
		for(MonHoc mon : dsMonHoc) {
			if(mon.getLoai().equals(loai)) {
				result.add(mon);
			}
		}
		return result;
	}
}
