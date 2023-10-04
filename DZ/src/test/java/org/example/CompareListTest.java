package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompareListTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void compareListAvarageTest1() {
        List<Integer> a = List.of(1, 2, 3, 4);
        List<Integer> b = List.of(1, 2, 3);
        CompareList.compareListAvarage(a, b);
        assertEquals("Среднее значение первого списка больше", outputStream.toString().trim());
    }

    @Test
    void compareListAvarageTest2() {
        List<Integer> a = List.of(1, 2, 3, 4);
        List<Integer> b = List.of(1, 2, 3);
        CompareList.compareListAvarage(b, a);
        assertEquals("Среднее значение второго списка больше", outputStream.toString().trim());
    }

    @Test
    void compareListAvarageTest3() {
        List<Integer> a = List.of(1, 2, 3);
        List<Integer> b = List.of(1, 2, 3);
        CompareList.compareListAvarage(b, a);
        assertEquals("Средние значения списков равны", outputStream.toString().trim());
    }

    @AfterEach
    public void cleanUp() {
        System.setOut(null);
    }
}