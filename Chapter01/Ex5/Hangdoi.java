package com.mycompany.chuong1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.LinkedList;

public class Hangdoi {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Sau khi thêm 10, 20, 30: " + queue);
        
        queue.addFirst(5);
        queue.addLast(40);
        System.out.println("Sau khi thêm 5 vào đầu và 40 vào cuối: " + queue);
        
        queue.removeFirst();
        queue.removeLast();
        System.out.println("Sau khi xóa phần tử đầu và cuối: " + queue);
    }
}