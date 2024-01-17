import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Khoa {
	private String ten;
	private String diaChi;
	private List<GiangVien> dsgv = new ArrayList<>();

	public Khoa(String ten, String diaChi, List<GiangVien> dsgv) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.dsgv = dsgv;
	}

	@Override
	public String toString() {
		return "Khoa [ten=" + ten + ", diaChi=" + diaChi + ", dsgv=" + dsgv + "]";
	}

	public void add(GiangVien gv) {
		dsgv.add(gv);
	}

	// Cau 1. Tìm ra giang vien co tong so tin chi cac mon co the day nhieu nhat
	public GiangVien timGiangVienDayNhieuTinChiNhat() {
		GiangVien result = null;
		int max = 0;
		for (GiangVien giangVien : dsgv) {
			if (giangVien.tongSoTinChi() > max) {
				max = giangVien.tongSoTinChi();
				result = giangVien;
			}
		}
		return result;
	}
//	// Cau 1. Tìm ra giang vien co tong so tin chi cac mon co the day nhieu nhat --java8
//	public GiangVien timGiangVienDayNhieuTinChiNhat() {
//		Comparator<GiangVien> comp = Comparator.comparing(GiangVien :: tongSoTinChi);
//		return this.dsgv.stream().max(comp).get();
//	}

//	Cau 2. Thong ke mon hoc theo loai
	public Map<String, List<MonHoc>> thongKeMonHocTheoLoai() {
		Map<String, List<MonHoc>> result = new HashMap<String, List<MonHoc>>();
		for (GiangVien giangVien : dsgv) {
			for (MonHoc monHoc : giangVien.getDsMonHoc()) {
				if (!result.containsKey(monHoc.getLoai())) {
					List<MonHoc> loai = new ArrayList<MonHoc>();
					loai.add(monHoc);
					result.put(monHoc.getLoai(), loai);
				} else {
					result.get(monHoc.getLoai()).add(monHoc);
				}
			}
		}
		return result;
	}

////	Cau 2. Thong ke mon hoc theo loai
//	public Map<String, List<MonHoc>> thongKeMonHocTheoLoai() {
//		return this.dsgv.stream().flatMap(x -> x.getDsMonHoc().stream())
//				.collect(Collectors.groupingBy(MonHoc::getLoai));
//	}

	
	// Cau 3. Tim mon hoc theo ten giang vien va loai
		public List<MonHoc> timMonHoc(String tenGiangVien, String loai) {
			for(GiangVien giangvien : dsgv) {
				if(giangvien.getHoTen().equals(tenGiangVien)) {
					return giangvien.getMonHoc(loai);
				}
			}
			return null;
		}
//	// Cau 3. Tim mon hoc theo ten giang vien va loai
//	public List<MonHoc> timMonHoc(String tenGiangVien, String loai) {
//		Comparator<MonHoc> comp = Comparator.comparing(MonHoc::getTen).thenComparing(MonHoc::getSoTinChi,
//				Comparator.reverseOrder());
//		List<MonHoc> result = this.dsgv.stream().filter(x -> x.getHoTen().equals(tenGiangVien))
//				.flatMap(x -> x.getDsMonHoc().stream()).filter(x -> x.getLoai().equals(loai))
//				.collect(Collectors.toList());
//		result.sort(comp);
//		return result;
//	}
}
