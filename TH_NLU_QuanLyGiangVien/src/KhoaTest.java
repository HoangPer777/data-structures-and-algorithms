import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

class KhoaTest {
	
	
	public static void main(String[] args) {
		
		MonHoc monHoc1 = new MonHoc("01", null, 2, "LyThuyet");
		MonHoc monHoc2 = new MonHoc("02", null, 3, "ThucHanh");
		MonHoc monHoc3 = new MonHoc("03", null, 4, "LyThuyet vs ThucHanh");
		MonHoc monHoc4 = new MonHoc("04", null, 1, "ThucHanh");
		MonHoc monHoc5 = new MonHoc("05", null, 2, "LyThuyet");
		MonHoc monHoc6 = new MonHoc("06", null, 3, "LyThuyet");
		MonHoc monHoc7 = new MonHoc("07", null, 2, "ThucHanh  vs ThucHanh");
		MonHoc monHoc8= new MonHoc("08", null, 4, "LyThuyet");
		MonHoc monHoc9 = new MonHoc("09", null, 1, "ThucHanh");
		
		GiangVien giangVien1 = new GiangVien("Hoang", 2004, new ArrayList<MonHoc>());
		giangVien1.add(monHoc1);
		giangVien1.add(monHoc2);
		giangVien1.add(monHoc3);
		
		GiangVien giangVien2 = new GiangVien("Duc", 2004, new ArrayList<MonHoc>());
		giangVien2.add(monHoc4);
		giangVien2.add(monHoc5);
		giangVien2.add(monHoc6);
		
		GiangVien giangVien3 = new GiangVien("Tai", 2004, new ArrayList<MonHoc>());
		giangVien3.add(monHoc7);
		giangVien3.add(monHoc8);
		giangVien3.add(monHoc9);
		
		Khoa khoa = new Khoa("IT", "LinhTrung", new ArrayList<GiangVien>());
		khoa.add(giangVien1);
		khoa.add(giangVien2);
		khoa.add(giangVien3);
		
//		System.out.println(khoa.timGiangVienDayNhieuTinChiNhat());
//		System.out.println(khoa.thongKeMonHocTheoLoai());
		System.out.println(khoa.timMonHoc("Hoang", "LyThuyet"));
	}

}
