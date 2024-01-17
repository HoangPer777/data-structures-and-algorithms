
public class UngCuVien {
	private String maSo;
	private String hoTen;
	private int namSinh;
	private double diemSo;

	public UngCuVien(String maSo, String hoTen, int namSinh, double diemSo) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemSo = diemSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public double getDiemSo() {
		return diemSo;
	}

	@Override
	public String toString() {
		return "UngCuVien [maSo=" + maSo + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemSo=" + diemSo + "]"
				+ "\n";
	}

	public boolean check() {
		return diemSo >= 5;
	}

}
