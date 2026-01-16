package com.mycompany.chuong1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.HashSet;
import java.util.Arrays;

public class hashset {
    public static void main(String[] args) {
        // 1. Mảng số nguyên có phần tử trùng nhau
        Integer[] numbers = {5, 2, 9, 2, 5, 8, 1};
        System.out.println("Mảng ban đầu: " + Arrays.toString(numbers));
        
        // 2. Đưa các phần tử vào HashSet
        HashSet<Integer> uniqueSet = new HashSet<>(Arrays.asList(numbers));
        
        // 3. In danh sách các phần tử duy nhất
        System.out.println("Các phần tử duy nhất: " + uniqueSet);
        
//HashSet lưu trữ dữ liệu dựa trên cơ chế băm (hash table), vì vậy nó không duy trì thứ tự các phần tử theo thứ tự ban đầu của mảng. Thứ tự các phần tử khi in ra phụ thuộc vào giá trị mã băm (hashCode) của từng phần tử.
    }
}