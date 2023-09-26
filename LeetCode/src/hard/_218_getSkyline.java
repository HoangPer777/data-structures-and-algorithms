package hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
// https://leetcode.com/problems/the-skyline-problem/description/
public class _218_getSkyline {
    public static List<List<Integer>> getSkyline(int[][] buildings) {
//    	tạo ra danh sách 2 chiều
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> height = new ArrayList<>();

        // Tìm ra điểm đầu và điểm cuối của tòa nhà
        for (int[] b : buildings) {
            height.add(List.of(b[0], -b[2]));
            height.add(List.of(b[1], b[2]));
        }
//        for (int i = 0; i < buildings.length; i++) {
//            height.add(List.of(buildings[i][0], -buildings[i][2]));
//            height.add(List.of(buildings[i][1], buildings[i][2]));
//        }

        // Sắp xếp vị trí của các điểm theo tọa độ tăng dần, nếu bằng tọa độ thì chiều cao giảm dần
        Collections.sort(height, (a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return a.get(0) - b.get(0);
            }
            return a.get(1) - b.get(1);
        });

        // Tạo ra một hàng đợi, giữ cho điểm có chiều cao lớn nhất ở đầu hàng đợi.
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        // Đưa chiều cao ban đầu 0 vào queue đầu tiên.
        pq.offer(0);
        int prev = 0;

        // Duyệt qua danh sách height
        for (List<Integer> h : height) {
            int x = h.get(0);
            int hValue = Math.abs(h.get(1));

            // Nếu là điểm đầu thì thêm vào queue, ngược lại
            if (h.get(1) < 0) {
                pq.offer(hValue);
            } else {
                pq.remove(hValue);
            }

            // Lấy chiều cao hiện tại là đỉnh của queue
//           peek(): Trả về phần tử đầu tiên của hàng đợi mà không loại bỏ nó, 
//           trả về null nếu hàng đợi rỗng
            int cur = pq.peek();

            // Nếu chiều cao hiện tại khác chiều cao trước đó thì thêm điểm và chiều cao
            // hiện tại vào danh sách kết quả rồi cập nhật prev(điểm trước đó) thành điểm hiện tại
            if (prev != cur) {
                result.add(List.of(x, cur));
                prev = cur;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        getSkyline(arr);
    }
}
