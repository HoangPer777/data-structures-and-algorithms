import java.util.ArrayList;
import java.util.List;

class DotUngTuyenTest {
	public static void main(String[] args) {
		
		UngCuVien ungCuVien = new UngCuVien("01", "Hoang", 2004, 10);
		UngCuVien ungCuVien1 = new UngCuVien("02", "Hung", 2005, 8);
		UngCuVien ungCuVien2 = new UngCuVien("03", "Hai", 2003, 5);
		UngCuVien ungCuVien3 = new UngCuVien("04", "Hau", 2002, 9);
		
		UngCuVien ungCuVien4 = new UngCuVien("05", "Thai", 2002, 7);
		UngCuVien ungCuVien5 = new UngCuVien("06", "Nhi", 2006, 9);
		UngCuVien ungCuVien6 = new UngCuVien("07", "Tuyen", 2000, 3);
		UngCuVien ungCuVien7 = new UngCuVien("08", "Nhu", 2009, 4);
		
		UngCuVien ungCuVien8 = new UngCuVien("09", "Bao", 2000, 9);
		UngCuVien ungCuVien9 = new UngCuVien("10", "Man", 2001, 6);
		UngCuVien ungCuVien10 = new UngCuVien("11", "Quang", 2002, 8);
		
		ViTriViecLam viTriViecLam = new ViTriViecLam("01", "backEnd", "fresher", new ArrayList<UngCuVien>());
		viTriViecLam.add(ungCuVien);
		viTriViecLam.add(ungCuVien1);
		viTriViecLam.add(ungCuVien2);
		viTriViecLam.add(ungCuVien3);
		
		ViTriViecLam viTriViecLam1 = new ViTriViecLam("02", "frontEnd", "Senior", new ArrayList<UngCuVien>());
		viTriViecLam1.add(ungCuVien4);
		viTriViecLam1.add(ungCuVien5);
		viTriViecLam1.add(ungCuVien6);
		viTriViecLam1.add(ungCuVien7);
		
		ViTriViecLam viTriViecLam2 = new ViTriViecLam("03", "fullStack", "Junior", new ArrayList<UngCuVien>());
		viTriViecLam2.add(ungCuVien8);
		viTriViecLam2.add(ungCuVien9);
		viTriViecLam2.add(ungCuVien10);
		
		DotUngTuyen dotUngTuyen = new DotUngTuyen("01", 2022, new ArrayList<ViTriViecLam>());
		dotUngTuyen.add(viTriViecLam);
		dotUngTuyen.add(viTriViecLam1);
		dotUngTuyen.add(viTriViecLam2);
		
//		System.out.println(dotUngTuyen.timUngCuVienDiemSoCaoNhat());
		System.out.println(dotUngTuyen.thongKeUngCuVienTheoDiemSo());
//		System.out.println(dotUngTuyen.timUngCuVien("frontEnd", 9).toString());
		
	}

}
