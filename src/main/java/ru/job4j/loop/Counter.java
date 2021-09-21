package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int rsl = 0;
        for (int i = start; i <= finish; i++) {
            rsl += i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 5));
        System.out.println(sum(1, 10));
        System.out.println(sum(7, 8));
    }
}
