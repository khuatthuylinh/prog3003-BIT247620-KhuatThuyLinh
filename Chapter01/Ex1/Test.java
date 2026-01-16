/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Test<T> {
    private T value;
    
    public void set(T t) {
        this.value = t;
    }
    
    public T get() {
        return value;
    }
    
    public static void main(String[] args) {
        Test<Integer> intTest = new Test<>();
        intTest.set(211);
        System.out.println("Gia tri nguyen: " + intTest.get());

        Test<String> stringTest = new Test<>();
        stringTest.set("Xin chào Việt Nam");
        System.out.println("String: " + stringTest.get());
    }
}
