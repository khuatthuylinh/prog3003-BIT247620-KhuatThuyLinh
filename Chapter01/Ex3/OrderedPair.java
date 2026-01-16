package com.mycompany.chuong1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;
    
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    @Override
    public K getKey() {
        return key;
    }
    
    @Override
    public V getValue() {
        return value;
    }
    
    public static void main(String[] args) {
        // Tạo cặp giá trị 1
        Pair<String, Integer> studentId = new OrderedPair<>("MSSV", 10170);
        System.out.println("Key: " + studentId.getKey() + ", Value: " + studentId.getValue());
        
        // Tạo cặp giá trị 2
        Pair<String, String> studentName = new OrderedPair<>("HoTen", "Nguyen Thi Hoa");
        System.out.println("Key: " + studentName.getKey() + ", Value: " + studentName.getValue());
    }
}