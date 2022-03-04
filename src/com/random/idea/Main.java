package com.random.idea;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 40) - 20);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("Минимальное значение");
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
        System.out.println("Максимальное значение");
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
        System.out.println("Наибольшее по модулю");
        if (max > min) {
            System.out.println(Math.abs(max));
        }
        else {
                System.out.println(Math.abs(min));
            }

    }
}


