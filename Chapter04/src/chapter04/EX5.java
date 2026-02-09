//Bài 5
//
//Yêu cầu:
//
//1. Tạo một Supplier<Double> để luôn trả về một số ngẫu nhiên từ 0 đến 100 (Math.random() * 100).
//
//2. Tạo một Consumer<Double> để in số đó ra màn hình với định dạng “Số may mắn: [số]”.
//
//3. Viết code gọi Supplier để lấy số, sau đó đưa số đó vào Consumer để in

package chapter04;

import java.util.function.*;

public class EX5 {
    public static void main(String[] args) {

        Supplier<Double> randomNumber =
                () -> Math.random() * 100;

        Consumer<Double> print =
                n -> System.out.println("Số may mắn: " + n);

        Double number = randomNumber.get();
        print.accept(number);
    }
}
