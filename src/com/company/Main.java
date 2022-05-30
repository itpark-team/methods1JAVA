package com.company;

import java.util.Scanner;

public class Main {

    static int InputInt(String message) {
        int number = 0;
        boolean inputResult;

        do {
            try {
                inputResult = true;
                Scanner scanner = new Scanner(System.in);

                System.out.print(message);
                number = scanner.nextInt();
            } catch (Exception e) {
                inputResult = false;
                System.out.println("Ошибка. Пожалуйста введите число!");
            }
        }
        while (inputResult == false);
        return number;
    }

    static int GetSum(int a, int b) {
        return a + b;
    }

    static void PrintHeader() {
        System.out.println("Super duper summator");
    }

    static void PrintResult(int result) {
        System.out.println("sum = " + result);
    }

    public static void main(String[] args) {
        PrintHeader();

        int a = InputInt("input a: ");
        int b = InputInt("input b: ");

        int result = GetSum(a, b);

        PrintResult(result);

        //PrintResult(GetSum(InputInt("input a: "), InputInt("input b: ")));
    }
}
