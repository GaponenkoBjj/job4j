package ru.job4j.loop;

public class Counter {
    /**
     * Ищем сумму чётных чисел от start до finish
     *
     * @param start
     * @param finish
     * @return
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}