//Bài 6
//
//Yêu cầu: Cho danh sách: Arrays.asList(1, 2, 3, 4, 5, 6). Sử dụng Stream API để thực hiện chuỗi hành động sau trên 1 dòng code (hoặc chain method):
//
//1. Lọc lấy các số chẵn.
//
//2. Bình phương các số đó (n -> n * n).
//
//3. Tính tổng các kết quả.

package chapter04;

import java.util.*;

public class EX6 {
    public static void main(String[] args) {

        int sum = Arrays.asList(1,2,3,4,5,6).stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
