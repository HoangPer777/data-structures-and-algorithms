package aa_ODich;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ODich {
	private String tenTrangTrai;
	private String tenChuTrangTrai;
	private String tinhThanh;
	private String quan;
	private String phuongXa;
	private String duong;
	private Date ngayPhatHienDich;
	private Date ngayDieuTra;
	private String tenNguoiDieuTra;
	private int soLuongGiaCamMacBen;

	@Override
	public String toString() {
		return "ODich [tenTrangTrai=" + tenTrangTrai + ", tenChuTrangTrai=" + tenChuTrangTrai + ", tinhThanh="
				+ tinhThanh + ", quan=" + quan + ", phuongXa=" + phuongXa + ", duong=" + duong + ", ngayPhatHienDich="
				+ ngayPhatHienDich + ", ngayDieuTra=" + ngayDieuTra + ", tenNguoiDieuTra=" + tenNguoiDieuTra
				+ ", soLuongGiaCamMacBen=" + soLuongGiaCamMacBen + "]";
	}

	public ODich(String tenTrangTrai, String tenChuTrangTrai, String tinhThanh, String quan, String phuongXa,
			String duong, Date ngayPhatHienDich, Date ngayDieuTra, String tenNguoiDieuTra, int soLuongGiaCamMacBen) {
		super();
		this.tenTrangTrai = tenTrangTrai;
		this.tenChuTrangTrai = tenChuTrangTrai;
		this.tinhThanh = tinhThanh;
		this.quan = quan;
		this.phuongXa = phuongXa;
		this.duong = duong;
		this.ngayPhatHienDich = ngayPhatHienDich;
		this.ngayDieuTra = ngayDieuTra;
		this.tenNguoiDieuTra = tenNguoiDieuTra;
		this.soLuongGiaCamMacBen = soLuongGiaCamMacBen;
	}

//	tổng số lượng gia cầm mắc bệnh                             
	public int tongGiaCamMacBenh(ArrayList<ODich> list) {
		int result = 0;
		for (ODich odich : list) {
			result += odich.soLuongGiaCamMacBen;
		}
		return result;
	}

//	thống kê tổng lượng gia cầm mắc bệnh theo tỉnh thành
	public TreeMap<String, Integer> thongKeSlgODichTheoTinhThanh(ArrayList<ODich> list) {
		TreeMap<String, Integer> result = new TreeMap<String, Integer>();
		for (ODich odich : list) {
			if (!result.containsKey(odich.tinhThanh)) {
				result.put(odich.tinhThanh, odich.soLuongGiaCamMacBen);
			} else {
				result.put(odich.tinhThanh, result.get(odich.tinhThanh) + odich.soLuongGiaCamMacBen);
			}
		}

		return result;

	}

	public static int getPreviousOfNumberInListIter(int i, ListIterator<Integer> listIter) {
		int result = 0;
		while (listIter.hasNext()) {
			if (listIter.next() == i) {
				listIter.previous();
				result = listIter.previous();
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(1);
		ListIterator<Integer> iter = list.listIterator();
		System.out.println(getPreviousOfNumberInListIter(2, iter));
		
//		HashSet <Integer> set = new HashSet(); 
//		 set.add(1); 
//		 set.add(2); 
//		 set.add(3); 
//		System.out.println(set);
		
		
//			
	}
}
