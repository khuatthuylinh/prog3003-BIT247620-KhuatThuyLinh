/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chuong1;

import java.util.HashMap;

public class NhanVien {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");
        System.out.println("Danh sách nhân viên: " + employees);
        
        String employee102 = employees.get(102);
        System.out.println("Nhân viên ID 102: " + employee102);
        
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
            System.out.println("Đã thêm ID 105 với tên 'Unknown'");
        }
        
        System.out.println("Danh sách sau khi kiểm tra: " + employees);
    }
}