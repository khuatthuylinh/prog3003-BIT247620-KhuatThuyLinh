/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX2;

public class NotificationFactory {

    public static Notification createNotification(String channel) {
        if (channel.equalsIgnoreCase("sms"))
            return new SMSNotification();
        if (channel.equalsIgnoreCase("email"))
            return new EmailNotification();
        return null;
    }
}

