import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DotUngTuyen {
	private String maSo;
	private int nam;
	private List<ViTriViecLam> dsViecLam = new ArrayList<ViTriViecLam>();

	public DotUngTuyen(String maSo, int nam, List<ViTriViecLam> dsViecLam) {
		super();
		this.maSo = maSo;
		this.nam = nam;
		this.dsViecLam = dsViecLam;
	}

	public void add(ViTriViecLam vt) {
		this.dsViecLam.add(vt);
	}
//	// Cau 1. Tim ung cu vien co diem so cao nhat -- ko oop
//	public UngCuVien timUngCuVienDiemSoCaoNhat() {
//		int max = 0;
//		UngCuVien result = null;
//		for (ViTriViecLam viTriViecLam : dsViecLam) {
//			for(UngCuVien ungCuVien : viTriViecLam.getDsUngCuVien()) {
//				if(ungCuVien.getDiemSo() > max) {
//					max = (int) ungCuVien.getDiemSo();
//					result = ungCuVien;
//				}
//			}
//		}
//		return result;
//	}

////	 Cau 1. Tim ung cu vien co diem so cao nhat -- co oop
//		public UngCuVien timUngCuVienDiemSoCaoNhat() {
//			int max = 0;
//			UngCuVien result = null;
//			for (ViTriViecLam viTriViecLam : dsViecLam) {
//				if(viTriViecLam.getDiemSoCaoNhat().getDiemSo() > max) {
//					max = (int)viTriViecLam.getDiemSoCaoNhat().getDiemSo();
//					result = viTriViecLam.getDiemSoCaoNhat();
//				}
//			}
//			return result;
//		}

//	 Cau 1. Tim ung cu vien co diem so cao nhat -- java 8
	public UngCuVien timUngCuVienDiemSoCaoNhat() {
		Comparator<UngCuVien> comp = Comparator.comparing(UngCuVien::getDiemSo);
		return this.dsViecLam.stream().flatMap(x -> x.getDsUngCuVien().stream()).max(comp).get();
	}

	// Cau 2. Thong ke ung cu vien theo diem so >= 5 va duoi 5 -- ko oop
	public Map<Boolean, List<UngCuVien>> thongKeUngCuVienTheoDiemSo() {
		Map<Boolean, List<UngCuVien>> result = new HashMap<Boolean, List<UngCuVien>>();
		List<UngCuVien> tren5 = new ArrayList<UngCuVien>();
		List<UngCuVien> duoi5 = new ArrayList<UngCuVien>();
		for (ViTriViecLam viTriViecLam : dsViecLam) {
			for (UngCuVien ungCuVien : viTriViecLam.getDsUngCuVien()) {
				if (ungCuVien.getDiemSo() >= 5) {
					tren5.add(ungCuVien);
				} else {
					duoi5.add(ungCuVien);
				}
			}
		}
		result.put(true, tren5);
		result.put(false, duoi5);
		return result;
	}
//	// Cau 2. Thong ke ung cu vien theo diem so
//	public Map<Boolean, List<UngCuVien>> thongKeUngCuVienTheoDiemSo() { 
//		return dsViecLam.stream().flatMap(x -> x.getDsUngCuVien().stream()) .collect(Collectors.groupingBy(x -> x.getDiemSo() >= 5.0));
//	}

	// Cau 3. Tim ra danh sach ung cu vien dua vao ten vi tri viec lam va diem so
	public Set<UngCuVien> timUngCuVien(String tenViTriViecLam, double diemSo) {
		for (ViTriViecLam viTriViecLam : dsViecLam) {
			if (viTriViecLam.getTenViTri().equals(tenViTriViecLam)) {
				return viTriViecLam.timDiemSo(diemSo);
			}
		}
		return null;
	}

//	//Cau 3. Tim ra danh sach ung cu vien dua vao ten vi tri viec lam va diem so --java 8
//	public Set<UngCuVien> timUngCuVien(String tenViTriViecLam, double diemSo) {
//		Comparator<UngCuVien> comp = Comparator.comparing(UngCuVien::getNamSinh, Comparator.reverseOrder())
//				.thenComparing(UngCuVien::getHoTen);
//		return dsViecLam.stream().filter(x -> x.getTenViTri().equals(tenViTriViecLam))
//				.flatMap(x -> x.getDsUngCuVien().stream()).filter(x -> x.getDiemSo() == diemSo)
//				.collect(Collectors.toCollection(() -> new TreeSet<>(comp)));
//	}

}
