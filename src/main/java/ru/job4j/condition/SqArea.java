package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl = Math.pow(p / ((k + 1) * 2), 2) * k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("If p = 6 and k = 2, then S = " + result1);
    }
}