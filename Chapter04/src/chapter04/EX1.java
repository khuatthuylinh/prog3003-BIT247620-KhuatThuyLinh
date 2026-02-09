//Bài 1
//
//Yêu cầu:
//
//• Tạo một Functional Interface tên là MathOperation với một phương thức duy nhất int compute(int a, int b).
//
//• Sử dụng Lambda Expression để triển khai các phép tính: Cộng, Trừ, Nhân, Chia.
//
//• Chạy và in ra các ví dụ.

package chapter04;

@FunctionalInterface
interface MathOperation {
    int compute(int a, int b);
}

public class EX1 {
    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;

        System.out.println("Cộng: " + add.compute(11, 2));
        System.out.println("Trừ: " + sub.compute(11, 2));
        System.out.println("Nhân: " + mul.compute(11, 2));
        System.out.println("Chia: " + div.compute(20, 2));
    }
}
