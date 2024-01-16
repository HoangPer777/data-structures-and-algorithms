import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ViTriViecLam {
	private String maSo;
	private String tenViTri;
	private String yeuCau;
	private List<UngCuVien> dsUngCuVien = new ArrayList<>();

	public ViTriViecLam(String maSo, String tenViTri, String yeuCau, List<UngCuVien> dsUngCuVien) {
		super();
		this.maSo = maSo;
		this.tenViTri = tenViTri;
		this.yeuCau = yeuCau;
		this.dsUngCuVien = dsUngCuVien;
	}

	public void add(UngCuVien ucv) {
		dsUngCuVien.add(ucv);
	}

	public String getTenViTri() {
		return this.tenViTri;
	}

	public List<UngCuVien> getDsUngCuVien() {
		return dsUngCuVien;
	}

	@Override
	public String toString() {
		return "ViTriVieclam [maSo=" + maSo + ", tenViTri=" + tenViTri + ", yeuCau=" + yeuCau + ", dsUngCuVien="
				+ dsUngCuVien + "]";
	}

//	cau 1
	public UngCuVien getDiemSoCaoNhat() {
		int max = 0;
		UngCuVien result = null;
		for (UngCuVien ungCuVien : dsUngCuVien) {
			if (ungCuVien.getDiemSo() > max) {
				max = (int) ungCuVien.getDiemSo();
				result = ungCuVien;
			}
		}
		return result;

	}

//	cau 3
	public Set<UngCuVien> timDiemSo(double diemSo) {
//		Comparator<UngCuVien> comp = Comparator.comparing(UngCuVien::getNamSinh, Comparator.reverseOrder())
//				.thenComparing(UngCuVien::getHoTen);
		Comparator<UngCuVien> comp = (o1,o2) -> ((o1.getNamSinh() == o2.getNamSinh()) ? 
				(o2.getNamSinh() - o1.getNamSinh())
						: (o1.getHoTen()).compareTo(o2.getHoTen()));
		Set<UngCuVien> result = new TreeSet<UngCuVien>(comp);
		result.add(getDiemSoCaoNhat());
		for (UngCuVien ungCuVien : dsUngCuVien) {
			if (ungCuVien.getDiemSo() == diemSo) {
				result.add(ungCuVien);
			}
		}
		return result;
	}

}
