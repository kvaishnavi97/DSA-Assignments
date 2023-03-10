package com.practice;

import java.util.Scanner;

public class Util {

    protected static int[] takeArrayInput(Scanner sc, int n) {
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    protected static Scanner getScanner() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
}
