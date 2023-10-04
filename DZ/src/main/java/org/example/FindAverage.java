package org.example;

import java.util.List;

public class FindAverage {
    public static double findAverage(List<Integer> integerList) {
        double result = 0;
        if (integerList.isEmpty()) {
            throw new IllegalStateException("Список пустой");
        } else {
            for (int i : integerList) {
                result += i;
            }
        }
        return result / integerList.size();
    }
}
