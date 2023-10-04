package org.example;

import java.util.List;

public class CompareList {
    public static void compareListAvarage(List<Integer> a, List<Integer> b) {
        double averageA = FindAverage.findAverage(a);
        double averageB = FindAverage.findAverage(b);
        if ((averageA - averageB) > 0) {
            System.out.println("Среднее значение первого списка больше");
        } else if ((averageA - averageB) < 0) {
            System.out.println("Среднее значение второго списка больше");
        } else {
            System.out.println("Средние значения списков равны");
        }

    }
}
