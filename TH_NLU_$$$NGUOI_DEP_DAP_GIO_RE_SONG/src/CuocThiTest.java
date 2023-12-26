import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class CuocThiTest {
	public static void main(String[] args) {
		QuaTrinhLamNghe caSi1 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2000);
		QuaTrinhLamNghe caSi6 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2010);
		QuaTrinhLamNghe caSi9 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2015);
		QuaTrinhLamNghe caSi10 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2002);

		QuaTrinhLamNghe mC1 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 1999);
		QuaTrinhLamNghe mC3 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2001);
		QuaTrinhLamNghe mC4 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2010);
		QuaTrinhLamNghe mC5 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2000);
		QuaTrinhLamNghe mC7 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2008);
		QuaTrinhLamNghe mC8 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2012);
		QuaTrinhLamNghe mC9 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2014);
		QuaTrinhLamNghe mC10 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2003);

		QuaTrinhLamNghe mua2 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2005);
		QuaTrinhLamNghe mua3 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2002);
		QuaTrinhLamNghe mua8 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2015);

		QuaTrinhLamNghe lapTrinhVien2 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2010);
		QuaTrinhLamNghe lapTrinhVien4 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2015);
		QuaTrinhLamNghe lapTrinhVien5 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2007);
		QuaTrinhLamNghe lapTrinhVien6 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2012);
		QuaTrinhLamNghe lapTrinhVien7 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2014);

		// ChiDep1
		Chi_Dep hoai = new Chi_Dep("22130084", "Huỳnh Linh Hoài");
		hoai.themNgheNghiep(caSi1);
		hoai.themNgheNghiep(mC1);
		hoai.themDiemQT(80);
		hoai.themDiemQT(95);
		hoai.themDiemQT(75);
		hoai.themDiemQT(88);
		hoai.themDiemQT(92);

		// ChiDep2
		Chi_Dep diem = new Chi_Dep("22150178", "Quách Phương Kiều Diễm");
		diem.themDiemQT(99);
		diem.themDiemQT(88);
		diem.themDiemQT(92);
		diem.themDiemQT(95);
		diem.themDiemQT(91);
		diem.themNgheNghiep(mua2);
		diem.themNgheNghiep(lapTrinhVien2);

		// ChiDep3
		Chi_Dep hoang = new Chi_Dep("22130086", "Phan Văn Hoàng");
		hoang.themDiemQT(94);
		hoang.themDiemQT(89);
		hoang.themDiemQT(96);
		hoang.themDiemQT(91);
		hoang.themDiemQT(98);
		hoang.themNgheNghiep(mC3);
		hoang.themNgheNghiep(mua3);

		// ChiDep4
		Chi_Dep tam = new Chi_Dep("22130273", "Đào Khánh Tâm");
		tam.themDiemQT(87);
		tam.themDiemQT(92);
		tam.themDiemQT(85);
		tam.themDiemQT(89);
		tam.themDiemQT(91);
		tam.themNgheNghiep(mC4);
		tam.themNgheNghiep(lapTrinhVien4);

		// Chi_Dep5
		Chi_Dep dat = new Chi_Dep("22130008", "Trần Tấn Đạt");
		dat.themDiemQT(90);
		dat.themDiemQT(85);
		dat.themDiemQT(88);
		dat.themDiemQT(92);
		dat.themDiemQT(87);
		dat.themNgheNghiep(mC5);
		dat.themNgheNghiep(lapTrinhVien5);

		// Chi_Dep6
		Chi_Dep thanhDat = new Chi_Dep("22130019", "Nguyễn Thành Đạt");
		thanhDat.themDiemQT(85);
		thanhDat.themDiemQT(89);
		thanhDat.themDiemQT(92);
		thanhDat.themDiemQT(87);
		thanhDat.themDiemQT(80);
		thanhDat.themNgheNghiep(caSi6);
		thanhDat.themNgheNghiep(lapTrinhVien6);

		// ChiDep7
		Chi_Dep trungHieu = new Chi_Dep("22130043", "Trần Trung Hiếu");
		trungHieu.themDiemQT(88);
		trungHieu.themDiemQT(91);
		trungHieu.themDiemQT(86);
		trungHieu.themDiemQT(93);
		trungHieu.themDiemQT(89);
		trungHieu.themNgheNghiep(mC7);
		trungHieu.themNgheNghiep(lapTrinhVien7);

		// ChiDep8
		Chi_Dep huuNam = new Chi_Dep("22130099", "Nguyễn Hữu Nam");
		huuNam.themDiemQT(90);
		huuNam.themDiemQT(88);
		huuNam.themDiemQT(94);
		huuNam.themDiemQT(89);
		huuNam.themDiemQT(92);
		huuNam.themNgheNghiep(mC8);
		huuNam.themNgheNghiep(mua8);

		// ChiDep9
		Chi_Dep duyenNhu = new Chi_Dep("22130889", "Huỳnh Thị Duyên Như");
		duyenNhu.themDiemQT(85);
		duyenNhu.themDiemQT(88);
		duyenNhu.themDiemQT(92);
		duyenNhu.themDiemQT(86);
		duyenNhu.themDiemQT(89);
		duyenNhu.themNgheNghiep(caSi9);
		duyenNhu.themNgheNghiep(mC9);

		// ChiDep10
		Chi_Dep ngocSari = new Chi_Dep("22130077", "Huỳnh Ngọc Sa Ri");
		ngocSari.themDiemQT(87);
		ngocSari.themDiemQT(90);
		ngocSari.themDiemQT(92);
		ngocSari.themDiemQT(88);
		ngocSari.themDiemQT(91);
		ngocSari.themNgheNghiep(caSi10);
		ngocSari.themNgheNghiep(mC10);

		NhomTrinhDien nhom1 =  new NhomTrinhDien("ID07-2019", 3);
		nhom1.themThanhVien(diem);
		nhom1.themThanhVien(hoang);
		nhom1.setBienDao("Huỳnh Linh Hoài");
		nhom1.setDiemNhom(90);
		nhom1.setPhieuBau(hoai, 1000);
		nhom1.setPhieuBau(diem, 1000);
		nhom1.setPhieuBau(hoang, 1000);

		NhomTrinhDien nhom2 = new NhomTrinhDien("Về thăm lăng Bác", 4);
		nhom2.themThanhVien(dat);
		nhom2.themThanhVien(tam);
		nhom2.themThanhVien(thanhDat);
		nhom2.setBienDao("Trần Tấn Đạt");
		nhom2.setDiemNhom(80);
		nhom2.setPhieuBau(dat, 900);
		nhom2.setPhieuBau(tam, 900);
		nhom2.setPhieuBau(thanhDat, 900);

		NhomTrinhDien nhom3 = new NhomTrinhDien("Bóng bóng bang bang", 7);
		nhom3.themThanhVien(duyenNhu);
		nhom3.themThanhVien(ngocSari);
		nhom3.themThanhVien(huuNam);
		nhom3.setBienDao("Trần Trung Hiếu");
		nhom3.setDiemNhom(70);
		nhom3.setPhieuBau(trungHieu, 800);
		nhom3.setPhieuBau(duyenNhu, 800);
		nhom3.setPhieuBau(ngocSari, 800);
		nhom3.setPhieuBau(ngocSari, 800);

		VongThi vongThi1 = new VongThi("Vong 1", new CachTinhDiem(0.5, 0.5));
		vongThi1.themNhomTrinhDien(nhom1);
		vongThi1.themNhomTrinhDien(nhom2);
		vongThi1.themNhomTrinhDien(nhom3);

		VongThi vongThi2 = new VongThi("Vong 2", new CachTinhDiem(0.6, 0.4));
		vongThi2.themNhomTrinhDien(nhom1);
		vongThi2.themNhomTrinhDien(nhom2);
		vongThi2.themNhomTrinhDien(nhom3);

		VongThi vongThi3 = new VongThi("Vong 3", new CachTinhDiem(0.7, 0.3));
		vongThi3.themNhomTrinhDien(nhom1);
		vongThi3.themNhomTrinhDien(nhom2);
		vongThi3.themNhomTrinhDien(nhom3);

		CuocThi cuocThi = new CuocThi("Perfect", 2023);
		cuocThi.themVongThi(vongThi1);
		cuocThi.themVongThi(vongThi2);
		cuocThi.themVongThi(vongThi3);

		
//		System.out.println(hoang.toString());
		
//		test class NhomTrinhDien
//		System.out.println(nhom2.toString());
//		nhom2.loaiThanhVien(2);
//		nhom2.setDiemNhom(10);
//		System.out.println(nhom2.toString());
//		System.out.println(nhom2.getPhieuBau(dat));
//		nhom2.setPhieuBauTV(dat);
//		nhom2.setNhomTruong(dat);
//		System.out.println(nhom2.getBienDao());
//		System.out.println(nhom2.getPhieuBau(dat));
		
//		test vongThi
//		System.out.println(vongThi1.toString());
//		vongThi1.loaiChiDep(2, 1);
//		System.out.println(vongThi1.getDiemTVNhom(nhom2));
//		System.out.println(vongThi1.getDsNhomTrinhDien());
//		vongThi1.sortNhomDiemSo();
//		System.out.println(vongThi1.toString());
		
		
//		System.out.println(cuocThi.toString());
		cuocThi.add_dsChiDep();
		System.out.println(cuocThi.getSetChiDepVongThi(vongThi3));
		System.out.println(cuocThi.getSetTongDiemChiDep());
		System.out.println(cuocThi.loaiChiDep(vongThi2, 3));
		System.out.println(cuocThi.thongKeChiDepBiLoai().toString());
		
//		System.out.println(cuocThi.thongKeChiDep_danhSachDiemSo());
		
	}

}
