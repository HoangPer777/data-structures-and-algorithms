import java.util.LinkedList;
import java.util.TreeSet;

public class Chi_Dep {
	private String id;
	private String hoTen;
	private TreeSet<QuaTrinhLamNghe> ngheNghiepList = new TreeSet<>();
	private LinkedList<Integer> diemQuaTrinh = new LinkedList<Integer>();
	private Boolean biLoai;
	private String tenVongBiLoai;
	public Chi_Dep(String id, String hoTen) {
		super();
		this.id = id;
		this.hoTen = hoTen;
	}
@Override
public String toString() {
	return "\n" + "Chi_Dep [" + hoTen + ", diem=" + diemQuaTrinh + " Sum="+getTongDiemQuaTrinh()+ ", biLoai=" + biLoai + ", tenVongBiLoai="
			+ tenVongBiLoai + "]" ;
}


	public String getTenVongBiLoai() {
		return tenVongBiLoai;
	}

	public void setTenVongBiLoai(String tenVongBiLoai) {
		this.tenVongBiLoai = tenVongBiLoai;
	}

	public Boolean getBiLoai() {
		return biLoai;
	}

	public LinkedList<Integer> getDiemQuaTrinh() {
		return diemQuaTrinh;
	}

	public void themDiemQT(int diem) {
		diemQuaTrinh.add(diem);
	}

	public void setBiLoai() {
		this.biLoai = true;
	}

	public String getHoTen() {
		// TODO Auto-generated method stub
		return hoTen;
	}

	// thêm nghề
	public void themNgheNghiep(QuaTrinhLamNghe nghe) {
		this.ngheNghiepList.add(nghe);
	}

	// method lấy tổng điểm quá trình
	public int getTongDiemQuaTrinh() {
		int sum = 0;
		for (int e : this.getDiemQuaTrinh()) {
			sum += e;
		}
		return sum;
	}

}
