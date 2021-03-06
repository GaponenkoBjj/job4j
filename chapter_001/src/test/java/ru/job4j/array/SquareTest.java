package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класс для проверки возведения числа в степени
 *
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 */

public class SquareTest {

    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound4Then14916() {
        int bound = 4;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound5Then() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expected = new int[]{1, 4, 9, 16, 25};
        assertThat(rst, is(expected));
    }
}