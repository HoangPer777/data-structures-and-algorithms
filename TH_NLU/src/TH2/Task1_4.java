package TH2;

public class Task1_4 {
	public static void MoveTower(int disk, char source, char dest, char spare) {
		if (disk == 1) {
//			move disk from source to dest
			System.out.println("Move disk 1 from " + source + " to " + dest);
			return;
		} else {
// Di chuyển n-1 đĩa từ nguồn tới thanh (spare) bằng (dest)
			MoveTower(disk - 1, source, spare, dest);
			// Di chuyển đĩa còn lại từ nguồn tới đích
			System.out.println("Move disk " + disk + " from " + source + " to " + dest);
// Di chuyển n-1 đĩa từ thanh trung gian (spare) bằng nguồn (source) rồi tới đích (dest)
			MoveTower(disk - 1, spare, dest, source);
		}

	}

	public static void main(String[] args) {
		int numDisks = 3; // Số đĩa ban đầu trong bài toán Tháp Hà Nội
		MoveTower(numDisks, 'A', 'C', 'B'); // Gọi phương thức để giải bài toán
	}

}
