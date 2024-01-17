
public class MonHoc {
	private String maSo;
	private String ten;
	private int soTinChi;
	private String loai;
	public MonHoc(String maSo, String ten, int soTinChi, String loai) {
		super();
		this.maSo = maSo;
		this.ten = ten;
		this.soTinChi = soTinChi;
		this.loai = loai;
	}
	public String getTen() {
		return ten;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public String getLoai() {
		return loai;
	}
	@Override
	public String toString() {
		return "\n" + "MonHoc [maSo=" + maSo +  ", soTinChi=" + soTinChi + ", loai=" + loai + "]" ;
	}
	
}
