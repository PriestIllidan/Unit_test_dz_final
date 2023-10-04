package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAverageTest {
    @Test
    void findAverageTest() {
        List<Integer> a = List.of(1, 2, 3, 4);
        assertEquals(2.5, FindAverage.findAverage(a));
    }

    @Test
    void findAveargeTestException() {
        List<Integer> a = List.of();
        assertThrows(IllegalStateException.class, () -> FindAverage.findAverage(a)).getClass();
    }
}