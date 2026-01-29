/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX4;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng");
    }
}
