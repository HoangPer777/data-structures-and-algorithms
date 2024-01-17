import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class QuanLySinhVien {
	private String tenkhoa;
	private List<LopHoc> danhSachLopHoc = new ArrayList<>();

	public QuanLySinhVien(String tenkhoa, List<LopHoc> danhSachLopHoc) {
		super();
		this.tenkhoa = tenkhoa;
		this.danhSachLopHoc = danhSachLopHoc;
	}

	public void add(LopHoc lh) {
		this.danhSachLopHoc.add(lh);
	}
	
	// Cau 1. Tim sinh vien co thoi gian hoc tap lau nhat - dựa vào khóa
	public SinhVien timSinhVien() {
		int max = 0;
		SinhVien result = null;
		for(LopHoc lopHoc : danhSachLopHoc) {
			if(lopHoc.getKhoa() > max) {
				result = lopHoc.getDssv().get(0);
			}
		}
		return result;
	}

//	// Cau 1. Tim sinh vien co thoi gian hoc tap lau nhat
//	public SinhVien timSinhVien() {
//		Comparator<LopHoc> comp = Comparator.comparing(LopHoc::getKhoa, Comparator.reverseOrder());
//		return danhSachLopHoc.stream().max(comp).get().getDssv().get(0);
//	}

	// Cau 2. Thong ke so luong sinh vien theo gioi tinh
	public Map<Boolean, List<SinhVien>> thongKeSinhVienTheoGioiTinh() {
		Map<Boolean, List<SinhVien>> result = new HashMap<Boolean, List<SinhVien>>();
		for(LopHoc lopHoc: danhSachLopHoc) {
			for(SinhVien sinhVien : lopHoc.getDssv()) {
				if(result.containsKey(sinhVien.isGioiTinh())) {
					result.get(sinhVien.isGioiTinh()).add(sinhVien);
				}else {
					List<SinhVien> sv = new ArrayList<>();
					sv.add(sinhVien);
					result.put(sinhVien.isGioiTinh(), sv);
				}
			}
		}
		return result;
	}
//	// Cau 2. Thong ke so luong sinh vien theo gioi tinh
//	public Map<Boolean, List<SinhVien>> thongKeSinhVienTheoGioiTinh() {
//		return this.danhSachLopHoc.stream().flatMap(x -> x.getDssv().stream())
//				.collect(Collectors.groupingBy(SinhVien::isGioiTinh));
//	}

	// Cau 3. tim sinh vien dua vao khoa va gioi tinh
		public Collection<SinhVien> timSinhVien(boolean gioiTinh, int khoa) {
			for(LopHoc lopHoc : danhSachLopHoc) {
				if(lopHoc.getKhoa() == khoa) {
					return lopHoc.timGioiTinh(gioiTinh);
				}
			                                      
			}
			return null;
		}
//	// Cau 3. tim sinh vien dua vao khoa va gioi tinh
//	public Collection<SinhVien> timSinhVien(boolean gioiTinh, int khoa) {
//		Comparator<SinhVien> comp = (o1, o2) -> ( o1.getNamSinh() == o2.getNamSinh()) ? (o2.getNamSinh() - o1.getNamSinh()) : (o1.getHoTen().compareTo(o2.getHoTen())) ;
////		Comparator<SinhVien> comp = Comparator.comparing(SinhVien::getHoTen).thenComparing(SinhVien::getNamSinh,
////				Comparator.reverseOrder());
//
//		return this.danhSachLopHoc.stream()
//				.filter(x -> x.getKhoa() == khoa)
//				.flatMap(x -> x.getDssv().stream())
//				.filter(x -> x.isGioiTinh() == gioiTinh)
//				
//				.collect(Collectors.toCollection(() -> new TreeSet<>(comp)));
//	}

}
