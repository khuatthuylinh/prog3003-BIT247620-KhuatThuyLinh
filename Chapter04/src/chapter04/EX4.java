//Bài 4
//
//Yêu cầu:
//
//Viết chương trình chuyển đổi một danh sách các chuỗi tiền tệ "$10", "$20", "$50" thành danh sách các số nguyên 10, 20, 50.
//
//• Sử dụng Function<String, Integer> để định nghĩa logic cắt bỏ dấu $ và ép kiểu (parseInt).
//
//• Áp dụng function này cho từng phần tử.

package chapter04;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EX4 {
    public static void main(String[] args) {

        List<String> money = Arrays.asList("$10", "$20", "$50");

        Function<String, Integer> convert =
                s -> Integer.parseInt(s.substring(1));

        List<Integer> result = money.stream()
                .map(convert)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
