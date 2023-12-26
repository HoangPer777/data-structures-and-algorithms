import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class NhomTrinhDien {
	private String loaiNhom;
	private String tenBaiHat;
	private String tenBienDao;
	private int DiemNhom;
	private Chi_Dep nhomTruong;
	private LinkedList<Chi_Dep> dsThanhVien = new LinkedList<>();
	private HashMap<Chi_Dep, Integer> phieuBauThanhVien = new HashMap<>();
	private String trangThaiNhom;

	public NhomTrinhDien(String tenBaiHat, int diemNhom) {
		super();
		this.tenBaiHat = tenBaiHat;
		DiemNhom = diemNhom;
	}

	
	@Override
	public String toString() {
		return "\n" + "[" + tenBaiHat + ", " + DiemNhom  + ", " + "dsThanhVien: " + dsThanhVien + "\n]";
	}

	public String getBienDao() {
		return tenBienDao;
	}
	public void setBienDao(String tenBienDao) {
		this.tenBienDao = tenBienDao;
	}
	public LinkedList<Chi_Dep> getDsThanhVien() {
		return dsThanhVien;
	}
	public HashMap<Chi_Dep, Integer> getPhieuBauThanhVien() {
		return phieuBauThanhVien;
	}
	public int getDiemNhom() {
		return DiemNhom;
	}
	public void setNhomTruong(Chi_Dep nhomTruong) {
		this.nhomTruong = nhomTruong;
	}
	public void setDsThanhVien(LinkedList<Chi_Dep> dsThanhVien) {
		this.dsThanhVien = dsThanhVien;
	}

// ok
	public void themThanhVien(Chi_Dep chi_Dep) {
		if (!dsThanhVien.contains(chi_Dep)) {
			dsThanhVien.add(chi_Dep);
		} else {
			dsThanhVien.remove(chi_Dep);
			dsThanhVien.add(chi_Dep);
		}

	}

//	ok - test ok
//	loại số lượng người có điểm thấp nhất
	public void loaiThanhVien(int slg) {
		dsThanhVien.sort((o1, o2) -> o1.getTongDiemQuaTrinh() - o2.getTongDiemQuaTrinh());
		for (int i = 0; i < slg; i++) {
			dsThanhVien.getFirst().setBiLoai();
			dsThanhVien.removeFirst();
		}
	}

// nếu có chị này thì return ko thì 0 phiếu bầu
	public int getPhieuBau(Chi_Dep chi_dep) {
		if (phieuBauThanhVien.containsKey(chi_dep)) {
			return phieuBauThanhVien.get(chi_dep);
		} else {
			return 0;
		}
	}

	public void setDiemNhom(int diemNhom) {
		DiemNhom = diemNhom;
	}

//	Có thêm một người bầu cho chị này
	public void setPhieuBauTV(Chi_Dep chi_dep) {
		if (!phieuBauThanhVien.containsKey(chi_dep)) {
			phieuBauThanhVien.put(chi_dep, 1);
		} else {
			phieuBauThanhVien.put(chi_dep, phieuBauThanhVien.get(chi_dep) + 1);
		}
	}

	public void setPhieuBau(Chi_Dep chiDep, int soLuongPhieuBau) {
		this.phieuBauThanhVien.put(chiDep, soLuongPhieuBau);
	}

}
