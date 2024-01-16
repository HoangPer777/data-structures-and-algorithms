public class SinhVien {
	private String mssv;
	private String hoTen;
	private boolean gioiTinh;
	private int namSinh;

	public SinhVien(String mssv, String hoTen, boolean gioiTinh, int namSinh) {
		super();
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
	}
	
	
	public int getNamSinh() {
		return namSinh;
	}


	public String getHoTen() {
		return hoTen;
	}


	public boolean isGioiTinh() {
		return gioiTinh;
	}

}