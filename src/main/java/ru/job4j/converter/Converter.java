package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + String.format("%.2f", euro) + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + String.format("%.2f", dollar) + " dollars.");
        float in = 140;
        float expectedEuro = 2;
        float expectedDollars = 140f / 60;
        float outDollar = Converter.rubleToDollar(in);
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = outEuro == expectedEuro;
        boolean passedDollars = outDollar == expectedDollars;
        System.out.println("140 rubles are 2 Euro. Test result: " + passedEuro);
        System.out.println("140 rubles are 2.33 Dollars. Test result: " + passedDollars);
    }
}