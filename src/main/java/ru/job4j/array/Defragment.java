package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullPoint = index;
                for (int i = nullPoint + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        int notNullPoint = i;
                        SwitchArray.swap(array, nullPoint, notNullPoint);
                        break;
                    }
                }
            }
        }
        return array;
    }
}

