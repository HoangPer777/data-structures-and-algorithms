
public class QuaTrinhLamNghe implements Comparable<QuaTrinhLamNghe> {
	private String maNN;
	private String tenNN;
	private int namBD;
	public QuaTrinhLamNghe(String maNN, String tenNN, int namBD) {
		super();
		this.maNN = maNN;
		this.tenNN = tenNN;
		this.namBD = namBD;
	}
	public String getMaNN() {
		return maNN;
	}
	public String getTenNN() {
		return tenNN;
	}
	public int getNamLamNghe() {
		return namBD;
	}
	public void setMaNN(String maNN) {
		this.maNN = maNN;
	}
	public void setTenNN(String tenNN) {
		this.tenNN = tenNN;
	}
	public void setNamBD(int namBD) {
		this.namBD = namBD;
	}
	@Override
	public int compareTo(QuaTrinhLamNghe other) {
		return this.namBD - other.namBD;
	}
	
}
