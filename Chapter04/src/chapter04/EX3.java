//Bài 3

//Yêu cầu: Viết Lambda để kiểm tra một số là số chẵn, sử dụng Predicate<T>
package chapter04;
import java.util.function.Predicate;
public class EX3 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(2)); 
        System.out.println(isEven.test(11));
    }
}
