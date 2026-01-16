/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

public class FruitList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Danh sách ban đầu: " + fruits);
        
        fruits.add(1, "Mango");
        System.out.println("Sau khi thêm Mango: " + fruits);
        
        int bananaIndex = fruits.indexOf("Banana");
        if (bananaIndex != -1) {
            fruits.set(bananaIndex, "Grapes");
        }
        System.out.println("Sau khi thay Banana bằng Grapes: " + fruits);
        
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Có Apple trong danh sách không? " + hasApple);
    }
}
