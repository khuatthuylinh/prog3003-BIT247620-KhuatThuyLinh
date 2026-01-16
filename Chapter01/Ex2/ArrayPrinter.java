/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class ArrayPrinter {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Mảng số nguyên: ");
        printArray(intArray);
        
        String[] stringArray = {"Khuất", "Thùy", "Linh"};
        System.out.print("Mảng string: ");
        printArray(stringArray);
    }
}