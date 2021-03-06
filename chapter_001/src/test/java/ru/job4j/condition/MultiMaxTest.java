package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класс для поиска наибольшего значения из трёх
 */
public class MultiMaxTest {

    @Test
    public void whenSecondMax1() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax2() {
        MultiMax check = new MultiMax();
        int result = check.max(1,4,2);
        assertThat(result,is(4));
    }

    @Test
    public void whenSecondMax3(){
        MultiMax check = new MultiMax();
        int result = check.max(1,4,2);
        assertThat(result,is(4));
    }
}