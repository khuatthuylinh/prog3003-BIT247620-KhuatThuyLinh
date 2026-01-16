/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chuong1;

import java.util.TreeMap;
import java.util.SortedMap;

public class SanPham {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();
        
        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);
        products.put("Monitor", 300.0);
        products.put("Adapter", 45.0);
        
        System.out.println("Danh sách sản phẩm (sắp xếp theo tên):");
        for (String key : products.keySet()) {
            System.out.println(key + ": $" + products.get(key));
        }
        
        SortedMap<String, Double> filteredProducts = products.subMap("K", "M");
        System.out.println("\nSản phẩm từ 'K' đến trước 'M': " + filteredProducts);
        
        SortedMap<String, Double> filteredProducts2 = products.subMap("K", "N");
        System.out.println("Sản phẩm từ 'K' đến trước 'N': " + filteredProducts2);
    }
}
