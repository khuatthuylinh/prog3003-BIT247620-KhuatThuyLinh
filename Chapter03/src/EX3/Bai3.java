/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX3;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Bai3 {
    public static void main(String[] args) {
        CompletableFuture
                .supplyAsync(() -> {
                    return Arrays.asList(1, 2, 5, 3, 100);
                })
                .thenApply(list ->
                        list.stream()
                                .filter(x -> x % 2 != 0)
                                .sorted()
                                .collect(Collectors.toList())
                )
                .thenApply(result -> "Kết quả là: " + result)
                .thenAccept(System.out::println);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
    }
}
