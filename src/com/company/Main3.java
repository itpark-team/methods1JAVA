package com.company;

public class Main3 {

    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    //a,b->MAX
    //a,b,c


    public static void main(String[] args) {
        System.out.println(getMax(getMax(3, 10), 8));
    }
}
