
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeSet;

public class VongThi {
	String iDVT;
	String tenVong;
	ArrayList<NhomTrinhDien> dsNhomTrinhDiem;
	CachTinhDiem cachTinhDiemChiDep;

	public VongThi(String iDVT, String tenVong, CachTinhDiem cachTinhDiemChiDep) {
		this.iDVT = iDVT;
		this.tenVong = tenVong;
		this.dsNhomTrinhDiem = new ArrayList<NhomTrinhDien>();
		this.cachTinhDiemChiDep = cachTinhDiemChiDep;
	}

	@Override
	public String toString() {
		return "VongThi [iDVT=" + iDVT + "\ttenVong=" + tenVong + "\tcachTinhDiemChiDep=" + cachTinhDiemChiDep
				+ "\tdsNhomTrinhDiem=" + dsNhomTrinhDiem + "]\n";
	}

	public String getiDVT() {
		return iDVT;
	}

	public void setiDVT(String iDVT) {
		this.iDVT = iDVT;
	}

	public String getTenVong() {
		return tenVong;
	}

	public void setTenVong(String tenVong) {
		this.tenVong = tenVong;
	}

	public ArrayList<NhomTrinhDien> getDsNhomTrinhDiem() {
		return dsNhomTrinhDiem;
	}

	public void setDsNhomTrinhDiem(ArrayList<NhomTrinhDien> dsNhomTrinhDiem) {
		this.dsNhomTrinhDiem = dsNhomTrinhDiem;
	}

	public CachTinhDiem getCachTinhDiemChiDep() {
		return cachTinhDiemChiDep;
	}

	public void setCachTinhDiemChiDep(CachTinhDiem cachTinhDiemChiDep) {
		this.cachTinhDiemChiDep = cachTinhDiemChiDep;
	}

	// method add nhóm trình diễn
	public void themNhomTrinhDien(NhomTrinhDien nhom) {
		this.dsNhomTrinhDiem.add(nhom);
	}

	public void loaiChiDep(int slgNhom, int slgThanhVien) {
		// hàm sẽ xóa số lượng thành viên ở nhóm có điểm thấp nhất
		// sắp xếp nhóm có điểm nhóm cao đến thấp
		dsNhomTrinhDiem.sort((o1, o2) -> {
			return o1.getDiemNhom() - o2.getDiemNhom();
		});
		int nhom = 0;
		for (NhomTrinhDien e : dsNhomTrinhDiem) {
			if (nhom == slgNhom) {
				return;
			} else {
				e.dsThanhVien.sort((o1, o2) -> {
					return o1.getTongDiemQuaTrinh() - o2.getTongDiemQuaTrinh();
				});
				for (int i = 0; i < slgThanhVien; i++) {
					ChiDep thanhVienCuoi = e.getDsThanhVien().getLast();
					thanhVienCuoi.setBiLoai();
					thanhVienCuoi.setTenVongBiLoai(tenVong);
					e.getDsThanhVien().removeLast();
				}
			}
			nhom++;
		}
	}

	// method set nhóm trưởng
	public void setNhomTruong(ChiDep chiDep, NhomTrinhDien nhom) {
		for (NhomTrinhDien n : dsNhomTrinhDiem) {
			if (n.getDsThanhVien().contains(chiDep)) {
				n.setTruongNhom(chiDep);
			} else {
				System.out.println("chiDep ko ton tai");
			}
		}
	}

	// method lấy điểm tv nhóm
	public HashMap<ChiDep, Integer> getDiemTVNhom(NhomTrinhDien n) {
		for (NhomTrinhDien nhom : dsNhomTrinhDiem) {
			if (nhom.equals(n)) {
				return nhom.getDiemTVNhom(cachTinhDiemChiDep);
			}
		}
		return null;
	}

// 		sortNhomDiemSo(): TreeSet trả về TreeSet sắp xếp các nhóm
//		theo điểm nhóm giảm dần
	public TreeSet<NhomTrinhDien> sortNhomDiemSo() {
		TreeSet<NhomTrinhDien> result = new TreeSet<NhomTrinhDien>((o1, o2) -> o1.getDiemNhom() - o2.getDiemNhom());
		for (NhomTrinhDien nhom : dsNhomTrinhDiem) {
			result.add(nhom);
		}
		return result;
	}

	public static void main(String[] args) {
		QuaTrinhLamNghe caSi1 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2000);
		QuaTrinhLamNghe caSi2 = new QuaTrinhLamNghe("CS", "Ca sĩ", 1999);
		QuaTrinhLamNghe caSi3 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2012);
		QuaTrinhLamNghe caSi4 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2003);
		QuaTrinhLamNghe caSi5 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2004);
		QuaTrinhLamNghe caSi6 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2010);
		QuaTrinhLamNghe caSi7 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2005);
		QuaTrinhLamNghe caSi8 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2008);
		QuaTrinhLamNghe caSi9 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2015);
		QuaTrinhLamNghe caSi10 = new QuaTrinhLamNghe("CS", "Ca sĩ", 2002);

		QuaTrinhLamNghe mC1 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 1999);
		QuaTrinhLamNghe mC2 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2002);
		QuaTrinhLamNghe mC3 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2001);
		QuaTrinhLamNghe mC4 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2010);
		QuaTrinhLamNghe mC5 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2000);
		QuaTrinhLamNghe mC6 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2005);
		QuaTrinhLamNghe mC7 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2008);
		QuaTrinhLamNghe mC8 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2012);
		QuaTrinhLamNghe mC9 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2014);
		QuaTrinhLamNghe mC10 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2003);

		QuaTrinhLamNghe mua1 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 1998);
		QuaTrinhLamNghe mua2 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2005);
		QuaTrinhLamNghe mua3 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2002);
		QuaTrinhLamNghe mua4 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2012);
		QuaTrinhLamNghe mua5 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2001);
		QuaTrinhLamNghe mua6 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2010);
		QuaTrinhLamNghe mua7 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2007);
		QuaTrinhLamNghe mua8 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2015);
		QuaTrinhLamNghe mua9 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2013);
		QuaTrinhLamNghe mua10 = new QuaTrinhLamNghe("MUA", "Nghệ sĩ múa", 2004);

		QuaTrinhLamNghe lapTrinhVien1 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2005);
		QuaTrinhLamNghe lapTrinhVien2 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2010);
		QuaTrinhLamNghe lapTrinhVien3 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2008);
		QuaTrinhLamNghe lapTrinhVien4 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2015);
		QuaTrinhLamNghe lapTrinhVien5 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2007);
		QuaTrinhLamNghe lapTrinhVien6 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2012);
		QuaTrinhLamNghe lapTrinhVien7 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2014);
		QuaTrinhLamNghe lapTrinhVien8 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2009);
		QuaTrinhLamNghe lapTrinhVien9 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2013);
		QuaTrinhLamNghe lapTrinhVien10 = new QuaTrinhLamNghe("LT", "Lập trình viên", 2006);

		// ChiDep1
		ChiDep hoai = new ChiDep("22130084", "Huỳnh Linh Hoài");
		hoai.themNgheNghiep(caSi1);
		hoai.themNgheNghiep(mC1);
		hoai.themNgheNghiep(mua1);
		hoai.themNgheNghiep(lapTrinhVien1);
		hoai.themDiemQT(80);
		hoai.themDiemQT(95);
		hoai.themDiemQT(75);
		hoai.themDiemQT(88);
		hoai.themDiemQT(92);

		// ChiDep2
		ChiDep diem = new ChiDep("22150178", "Quách Phương Kiều Diễm");
		diem.themDiemQT(99);
		diem.themDiemQT(88);
		diem.themDiemQT(92);
		diem.themDiemQT(95);
		diem.themDiemQT(91);
		diem.themNgheNghiep(caSi2);
		diem.themNgheNghiep(mC2);
		diem.themNgheNghiep(mua2);
		diem.themNgheNghiep(lapTrinhVien2);

		// ChiDep3
		ChiDep hoang = new ChiDep("22130088", "Phan Văn Hoàng");
		hoang.themDiemQT(94);
		hoang.themDiemQT(89);
		hoang.themDiemQT(96);
		hoang.themDiemQT(91);
		hoang.themDiemQT(98);
		hoang.themNgheNghiep(caSi3);
		hoang.themNgheNghiep(mC3);
		hoang.themNgheNghiep(mua3);
		hoang.themNgheNghiep(lapTrinhVien3);

		// ChiDep4
		ChiDep tam = new ChiDep("22130273", "Đào Khánh Tâm");
		tam.themDiemQT(87);
		tam.themDiemQT(92);
		tam.themDiemQT(85);
		tam.themDiemQT(89);
		tam.themDiemQT(91);
		tam.themNgheNghiep(caSi4);
		tam.themNgheNghiep(mC4);
		tam.themNgheNghiep(mua4);
		tam.themNgheNghiep(lapTrinhVien4);

		// ChiDep5
		ChiDep dat = new ChiDep("22130008", "Trần Tấn Đạt");
		dat.themDiemQT(90);
		dat.themDiemQT(85);
		dat.themDiemQT(88);
		dat.themDiemQT(92);
		dat.themDiemQT(89);
		dat.themNgheNghiep(caSi5);
		dat.themNgheNghiep(mC5);
		dat.themNgheNghiep(mua5);
		dat.themNgheNghiep(lapTrinhVien5);

		// ChiDep6
		ChiDep thanhDat = new ChiDep("22130019", "Nguyễn Thành Đạt");
		thanhDat.themDiemQT(85);
		thanhDat.themDiemQT(89);
		thanhDat.themDiemQT(92);
		thanhDat.themDiemQT(87);
		thanhDat.themDiemQT(90);
		thanhDat.themNgheNghiep(caSi6);
		thanhDat.themNgheNghiep(mC6);
		thanhDat.themNgheNghiep(mua6);
		thanhDat.themNgheNghiep(lapTrinhVien6);

		// ChiDep7
		ChiDep trungHieu = new ChiDep("22130043", "Trần Trung Hiếu");
		trungHieu.themDiemQT(88);
		trungHieu.themDiemQT(91);
		trungHieu.themDiemQT(86);
		trungHieu.themDiemQT(93);
		trungHieu.themDiemQT(89);
		trungHieu.themNgheNghiep(caSi7);
		trungHieu.themNgheNghiep(mC7);
		trungHieu.themNgheNghiep(mua7);
		trungHieu.themNgheNghiep(lapTrinhVien7);

		// ChiDep8
		ChiDep huuNam = new ChiDep("22130099", "Nguyễn Hữu Nam");
		huuNam.themDiemQT(90);
		huuNam.themDiemQT(88);
		huuNam.themDiemQT(94);
		huuNam.themDiemQT(89);
		huuNam.themDiemQT(92);
		huuNam.themNgheNghiep(caSi8);
		huuNam.themNgheNghiep(mC8);
		huuNam.themNgheNghiep(mua8);
		huuNam.themNgheNghiep(lapTrinhVien8);

		// ChiDep9
		ChiDep duyenNhu = new ChiDep("22130889", "Huỳnh Thị Duyên Như");
		duyenNhu.themDiemQT(85);
		duyenNhu.themDiemQT(88);
		duyenNhu.themDiemQT(92);
		duyenNhu.themDiemQT(86);
		duyenNhu.themDiemQT(89);
		duyenNhu.themNgheNghiep(caSi9);
		duyenNhu.themNgheNghiep(mC9);
		duyenNhu.themNgheNghiep(mua9);
		duyenNhu.themNgheNghiep(lapTrinhVien9);

		// ChiDep10
		ChiDep ngocSari = new ChiDep("22130077", "Huỳnh Ngọc Sa Ri");
		ngocSari.themDiemQT(87);
		ngocSari.themDiemQT(90);
		ngocSari.themDiemQT(92);
		ngocSari.themDiemQT(88);
		ngocSari.themDiemQT(91);
		ngocSari.themNgheNghiep(caSi10);
		ngocSari.themNgheNghiep(mC10);
		ngocSari.themNgheNghiep(mua10);
		ngocSari.themNgheNghiep(lapTrinhVien10);

		NhomTrinhDien nhom1 = new NhomTrinhDien("Trình diễn", "ID07-2019", hoai);
		nhom1.themThanhVien(diem);
		nhom1.themThanhVien(hoang);
		nhom1.setBienDao("Huỳnh Linh Hoài");
		nhom1.setDiemNhom(90);
		nhom1.setTrangThaiNhom("Quá đỉnh em ơi");
		nhom1.setPhieuBau(hoai, 1000);
		nhom1.setPhieuBau(diem, 1000);
		nhom1.setPhieuBau(hoang, 1000);

		NhomTrinhDien nhom2 = new NhomTrinhDien("Múa", "Về thăm lăng Bác", dat);
		nhom2.themThanhVien(tam);
		nhom2.themThanhVien(thanhDat);
		nhom2.setBienDao("Trần Tấn Đạt");
		nhom2.setDiemNhom(80);
		nhom2.setTrangThaiNhom("Quá ổn em ơi");
		nhom2.setPhieuBau(dat, 900);
		nhom2.setPhieuBau(tam, 900);
		nhom2.setPhieuBau(thanhDat, 900);

		NhomTrinhDien nhom3 = new NhomTrinhDien("Nhảy", "Bóng bóng bang bang", trungHieu);
		nhom3.themThanhVien(duyenNhu);
		nhom3.themThanhVien(ngocSari);
		nhom3.themThanhVien(huuNam);
		nhom3.setBienDao("Trần Trung Hiếu");
		nhom3.setDiemNhom(70);
		nhom3.setTrangThaiNhom("Quá dữ em ơi");
		nhom3.setPhieuBau(trungHieu, 800);
		nhom3.setPhieuBau(duyenNhu, 800);
		nhom3.setPhieuBau(ngocSari, 800);
		nhom3.setPhieuBau(ngocSari, 800);

		VongThi vongThi1 = new VongThi("01", "Vong 1", new CachTinhDiem(0.5, 0.5));
		vongThi1.themNhomTrinhDien(nhom1);
		vongThi1.themNhomTrinhDien(nhom2);
		vongThi1.themNhomTrinhDien(nhom3);

		VongThi vongThi2 = new VongThi("02", "Vong 2", new CachTinhDiem(0.6, 0.4));
		vongThi2.themNhomTrinhDien(nhom1);
		vongThi2.themNhomTrinhDien(nhom2);

		vongThi2.themNhomTrinhDien(nhom3);

		VongThi vongThi3 = new VongThi("03", "Vong 3", new CachTinhDiem(0.7, 0.3));
		vongThi3.themNhomTrinhDien(nhom1);
		vongThi3.themNhomTrinhDien(nhom2);
		vongThi3.themNhomTrinhDien(nhom3);
//		System.out.println(nhom3.toString());
//		vongThi1.loaiChiDep(1, 1);
//		System.out.println(nhom3.toString());
//		System.out.println("Lấy ra điểm thành viên nhóm: "+vongThi1.getDiemTVNhom(nhom1));

	}
}
