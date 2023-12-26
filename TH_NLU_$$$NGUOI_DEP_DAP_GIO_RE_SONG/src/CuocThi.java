import java.awt.Checkbox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

public class CuocThi {
	ArrayList<Chi_Dep> dsChiDep = new ArrayList<>();
	ArrayList<VongThi> vongThi = new ArrayList<>();
	String tenCuocThi;
	int namToChuc;

	public CuocThi(String tenCuocThi, int namToChuc) {
		super();
		this.tenCuocThi = tenCuocThi;
		this.namToChuc = namToChuc;
	}

	@Override
	public String toString() {
		return "CuocThi [ " + "dsChiDep=" + dsChiDep + ", vongThi=" + vongThi + "]";
	}

	public ArrayList<Chi_Dep> getDsChiDep() {
		return dsChiDep;
	}

	public ArrayList<VongThi> getVongThi() {
		return vongThi;
	}

//	thêm phương thức add danh sách các chị đẹp ở class trước vào đây dsChiDep
	public void add_dsChiDep() {
		for (VongThi vongThi : vongThi) {
			for (NhomTrinhDien nhom : vongThi.getDsNhomTrinhDien()) {
				for (Chi_Dep chiDep : nhom.getDsThanhVien()) {
					dsChiDep.add(chiDep);
				}
			}
		}

	}

//	 cho ra TreeSet chị đẹp theo giảm dần điểm 
//	của vòng thi của các chị đep trong chương trình
	public TreeSet<Chi_Dep> getSetChiDepVongThi(VongThi v) {
		TreeSet<Chi_Dep> setChiDep = new TreeSet<>((o1, o2) -> o2.getTongDiemQuaTrinh() - o1.getTongDiemQuaTrinh());
		for (NhomTrinhDien nhom : v.getDsNhomTrinhDien()) {
			for (Chi_Dep chiDep : nhom.getDsThanhVien()) {
				setChiDep.add(chiDep);
			}
		}
		return setChiDep;
	}

//	 cho ra TreeSet chị đẹp theo giảm dần tổng
//	 điểm của quá trình thi của các chị đep trong chương trình.
	public TreeSet<Integer> getSetTongDiemChiDep() {
		TreeSet<Integer> setTongDiem = new TreeSet<>((o1, o2) -> o2 - o1);
		for (Chi_Dep chiDep : dsChiDep) {
			int tongDiem = chiDep.getDiemQuaTrinh().stream().mapToInt(Integer::intValue).sum();
			setTongDiem.add(tongDiem);
		}
		return setTongDiem;
	}

//	chưa xóa chị đẹp đi nếu bị loại, vòng 2 3 vẫn loại người đã bị loại 
	public ArrayList<Chi_Dep> loaiChiDep(VongThi vt, int soLuong) {
		ArrayList<Chi_Dep> removedChiDep = new ArrayList<>();
		TreeSet<Chi_Dep> bangDiemChiDep = getSetChiDepVongThi(vt);
		int i = bangDiemChiDep.size();
		for (Chi_Dep chiDep : bangDiemChiDep) {
			if (i > bangDiemChiDep.size() - soLuong) {
				removedChiDep.add(chiDep);
				chiDep.setBiLoai();
				chiDep.setTenVongBiLoai(vt.getTenVong());
				i--;
			}

		}
		return removedChiDep;
	}

//	cho biết chị đẹp và điểm qua các vòng thi, vòng thi sau thì điểm phía sau
	public HashMap<Chi_Dep, LinkedList<Integer>> thongKeChiDep_danhSachDiemSo() {
		HashMap<Chi_Dep, LinkedList<Integer>> chiDepDiemMap = new HashMap<>();
		for (Chi_Dep chiDep : dsChiDep) {
			chiDepDiemMap.put(chiDep, chiDep.getDiemQuaTrinh());
		}
		return chiDepDiemMap;
	}

	public void themVongThi(VongThi v) {
		vongThi.add(v);
	}

	public void themChiDep(Chi_Dep chiDep) {
		dsChiDep.add(chiDep);
	}

	public HashMap<VongThi, Integer> thongKeChiDepBiLoai() {
		HashMap<VongThi, Integer> biLoaiMap = new HashMap<>();
		for (VongThi vongThi : vongThi) {
			int count = 0;
			for (NhomTrinhDien nhom : vongThi.getDsNhomTrinhDien()) {
				for (Chi_Dep chiDep : nhom.getDsThanhVien()) {
					if (chiDep.getBiLoai() != null && chiDep.getBiLoai()) {
						count++;

					}
				}
			}
			biLoaiMap.put(vongThi, count);
		}

		return biLoaiMap;
	}

}
