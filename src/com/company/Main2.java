package com.company;

import java.util.Random;

public class Main2 {

    static void printArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    static void randomArray(int[] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }
    }

    static int[] createArray(int length) {
        return new int[length];
    }

    public static void main(String[] args) {
        int[] mas = createArray(10);

        randomArray(mas);
        printArray(mas);
    }
}
