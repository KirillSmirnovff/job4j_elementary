package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        double percentValue = percent / 100;
        while (amount + amount * percentValue - salary >= 0) {
          amount += amount * percentValue - salary;
          year++;
        }
        return year;
    }
}
