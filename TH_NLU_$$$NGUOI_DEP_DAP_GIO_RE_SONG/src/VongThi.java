import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class VongThi {
	private String idVT;
	private String tenVong;
	private ArrayList<NhomTrinhDien> dsNhomTrinhDien = new ArrayList<>();
	private CachTinhDiem cachTinhDiemChiDep;

	public VongThi(String tenVong, CachTinhDiem cachTinhDiemChiDep) {
		super();
		this.tenVong = tenVong;
		this.cachTinhDiemChiDep = cachTinhDiemChiDep;
	}

	@Override
	public String toString() {
		return  "\n" + "VongThi [tenVong=" + tenVong + ", dsNhomTrinhDien=" + dsNhomTrinhDien + "]";
	}

	public ArrayList<NhomTrinhDien> getDsNhomTrinhDien() {
		return dsNhomTrinhDien;
	}

	public String getTenVong() {
		return tenVong;
	}

//	ok
	// hàm sẽ xóa số lượng thành viên ở nhóm có điểm thấp nhất
	// sắp xếp nhóm có điểm nhóm cao đến thấp
	public void loaiChiDep(int slgNhom, int slgThanhVien) {
		dsNhomTrinhDien.sort((o1, o2) -> o1.getDiemNhom() - o2.getDiemNhom());
		int nhom = 0;
		for (NhomTrinhDien e : dsNhomTrinhDien) {
			if (nhom == slgNhom) {
				return;
			} else {
				e.getDsThanhVien().sort((o1, o2) -> o1.getTongDiemQuaTrinh() - o2.getTongDiemQuaTrinh());
				for (int i = 0; i < slgThanhVien; i++) {
					Chi_Dep thanhVienCuoi = e.getDsThanhVien().getLast();
					thanhVienCuoi.setBiLoai();
					thanhVienCuoi.setTenVongBiLoai(tenVong);
					e.getDsThanhVien().removeFirst();
				}
			}
			nhom++;
		}
	}

// ok
	public void themNhomTrinhDien(NhomTrinhDien nhomTrinhDien) {
		dsNhomTrinhDien.add(nhomTrinhDien);
	}

// nếu ko tồn tại thì sao
	public void setNhomTruong(Chi_Dep chi_Dep, NhomTrinhDien n) {
		n.setNhomTruong(chi_Dep);
	}

// ok
	public void SetThanhVien(Chi_Dep chi_Dep, NhomTrinhDien n) {
		n.themThanhVien(chi_Dep);
	}

// ok
	public void setCachTinhDiem(CachTinhDiem c1) {
		this.cachTinhDiemChiDep = c1;
	}

//	ok - test
//	hàm sẽ dựa vào cách tính điểm lấy điểm nhóm là điểm của ban giám khảo 
//	cộng với điểm biếu bầu theo tỉ lệ của cách tính điểm
	public HashMap<Chi_Dep, Integer> getDiemTVNhom(NhomTrinhDien nhom) {
		HashMap<Chi_Dep, Integer> diemTVNhom = new HashMap<>();
		double phanTramDiemNhom = cachTinhDiemChiDep.getPhanTramDiemBGK();
		double phanTramDiemTV = cachTinhDiemChiDep.getPhanTramPB();
		for (Chi_Dep chiDep : nhom.getDsThanhVien()) {
			int diemNhom = nhom.getDiemNhom();

//			int diemThanhVien = chiDep.getDiemQuaTrinh().stream().mapToInt(Integer::intValue).sum();
			int diemThanhVien = chiDep.getTongDiemQuaTrinh();

			// Tính toán điểm tổng cộng
			int tongDiem = (int) (diemNhom * phanTramDiemNhom + diemThanhVien * phanTramDiemTV);
			diemTVNhom.put(chiDep, tongDiem);
		}
		return diemTVNhom;
	}

//	ok - test
//	sort số điểm các nhóm theo thứ tự giảm dần
	public TreeSet<NhomTrinhDien> sortNhomDiemSo() {
		TreeSet<NhomTrinhDien> result = new TreeSet<NhomTrinhDien>((o1, o2) -> o1.getDiemNhom() - o2.getDiemNhom());
		for (NhomTrinhDien nhomTrinhDien : dsNhomTrinhDien) {
			result.add(nhomTrinhDien);
		}
		return result;

	}
}
