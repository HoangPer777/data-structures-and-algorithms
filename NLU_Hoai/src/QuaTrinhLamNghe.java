
import java.time.LocalDate;

public class QuaTrinhLamNghe implements Comparable<QuaTrinhLamNghe> {
	String maNN;
	String tenNN;
	int namBD;

	public String getMaNN() {
		return maNN;
	}

	public void setMaNN(String maNN) {
		this.maNN = maNN;
	}

	public String getTenNN() {
		return tenNN;
	}

	public void setTenNN(String tenNN) {
		this.tenNN = tenNN;
	}

	public int getNamBD() {
		return namBD;
	}

	public void setNamBD(int namBD) {
		this.namBD = namBD;
	}

	public QuaTrinhLamNghe(String maNN, String tenNN, int namBD) {
		this.maNN = maNN;
		this.tenNN = tenNN;
		this.namBD = namBD;
	}

	@Override
	public String toString() {
		return " Mã=" + maNN + ", \t Tên=" + tenNN + ", \t Năm=" + namBD + "\n";
	}

	@Override
	public int compareTo(QuaTrinhLamNghe that) {
		if (this.namBD > that.namBD) {
			return 1;
		} else {
			return -1;
		}
	}
	public static void main(String[] args) {
		QuaTrinhLamNghe caSi1= new QuaTrinhLamNghe("CS", "Ca sĩ", 2000);
		QuaTrinhLamNghe caSi2= new QuaTrinhLamNghe("CS", "Ca sĩ", 1999);
		QuaTrinhLamNghe caSi3= new QuaTrinhLamNghe("CS", "Ca sĩ", 2012);
		QuaTrinhLamNghe caSi4= new QuaTrinhLamNghe("CS", "Ca sĩ", 2003);
		QuaTrinhLamNghe caSi5= new QuaTrinhLamNghe("CS", "Ca sĩ", 2004);
		
		QuaTrinhLamNghe mC1 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 1999);
		QuaTrinhLamNghe mC2 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2002);
		QuaTrinhLamNghe mC3 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2001);
		QuaTrinhLamNghe mC4 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2010);
		QuaTrinhLamNghe mC5 = new QuaTrinhLamNghe("MC", "Dẫn chương trình", 2000);
	}

}
