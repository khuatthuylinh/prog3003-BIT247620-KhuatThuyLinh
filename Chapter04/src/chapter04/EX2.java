//Bài 2
//
//Yêu cầu:
//
//• Cho danh sách: List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");
//
//• Hãy sử dụng Collections.sort kết hợp với Lambda Expression để sắp xếp danh sách này theo độ dài của tên thành phố (từ ngắn đến dài).

package chapter04;
import java.util.*;

public class EX2 {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");

        Collections.sort(cities, (a, b) -> a.length() - b.length());

        System.out.println(cities);
    }
}
