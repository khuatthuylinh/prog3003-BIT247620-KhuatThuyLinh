/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chuong1;

import java.util.TreeSet;

public class TriSet {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");
        
        System.out.println("Danh sách tên (tự động sắp xếp): " + names);
        
        String first = names.first();
        String last = names.last();
        System.out.println("Phần tử đầu tiên (nhỏ nhất): " + first);
        System.out.println("Phần tử cuối cùng (lớn nhất): " + last);
    }
}
