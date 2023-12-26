
public class CachTinhDiem {
	double phanTramDiemBGK;
	double phanTramDiemPB;
	public CachTinhDiem(double phanTramDiemBGK, double phanTramDiemPB) {
		this.phanTramDiemBGK = phanTramDiemBGK;
		this.phanTramDiemPB = phanTramDiemPB;
	}
	public double getPhanTramDiemBGK() {
		return phanTramDiemBGK;
	}
	public void setPhanTramDiemBGK(double phanTramDiemBGK) {
		this.phanTramDiemBGK = phanTramDiemBGK;
	}
	public double getPhanTramDiemPB() {
		return phanTramDiemPB;
	}
	public void setPhanTramDiemPB(double phanTramDiemPB) {
		this.phanTramDiemPB = phanTramDiemPB;
	}
	@Override
	public String toString() {
		return "CachTinhDiem [phanTramDiemBGK=" + phanTramDiemBGK + ", phanTramDiemPB=" + phanTramDiemPB + "]";
	}
	
}
