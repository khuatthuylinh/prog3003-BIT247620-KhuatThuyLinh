/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX4;
import java.util.concurrent.CompletableFuture;

public class Bai4 {
    public static void main(String[] args) {
        CompletableFuture<Void> checkProduct =
                CompletableFuture.runAsync(() -> {
                    sleep(2000);
                    System.out.println("Sản phẩm khả dụng");
                });

        CompletableFuture<Void> payment =
                CompletableFuture.runAsync(() -> {
                    sleep(3000);
                    System.out.println("Thanh toán thành công");
                });

        CompletableFuture<Void> shipping =
                CompletableFuture.runAsync(() -> {
                    sleep(2500);
                    System.out.println("Đang vận chuyển");
                });

        CompletableFuture
                .allOf(checkProduct, payment, shipping)
                .thenRun(() ->
                        System.out.println("Hoàn thành đơn hàng!")
                )
                .join();
    }

    static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {}
    }
}
