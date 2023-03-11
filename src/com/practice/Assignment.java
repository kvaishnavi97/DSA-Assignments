package com.practice;

import java.util.Arrays;
import java.util.Scanner;

import static com.practice.Util.getScanner;
import static com.practice.Util.takeArrayInput;

public class Assignment {
    class Perfect {
        static void findPerfect() {
            Scanner sc = getScanner();
            System.out.println("Enter the no of integers: ");
            int n = sc.nextInt();
            int[] array = takeArrayInput(sc, n);
            int start = 0, end = array.length - 1;
            while (start <= end) {
                if (array[start] == array[end]) {
                    start++;
                    end--;
                } else
                    break;
            }
            if (start >= end)
                System.out.println("Given array is a perfect");
            else
                System.out.println("Given array is not a perfect");
        }
    }

    class MaxMinStep {

        static int findMaxMinStep() {
            Scanner sc = getScanner();
            System.out.println("Enter the no of integers: ");
            int n = sc.nextInt();
            int[] array = takeArrayInput(sc, n);
            //sort the array
            Arrays.sort(array);
            int mid = (array.length) / 2;
            if ((array.length % 2) == 1) {
                return array[mid];
            } else {
                if (array[mid] < array[mid - 1])
                    return array[mid];
                else
                    return array[mid - 1];
            }
        }
    }

    class LeastTwoGreatestElements {

        static void findLeastMaxElements() {
            Scanner sc = getScanner();
            System.out.println("Enter the no of integers: ");
            int n = sc.nextInt();
            int[] array = takeArrayInput(sc, n);
            Arrays.sort(array);
            for (int i = 0; i < n - 2; i++)
                System.out.print(array[i] + " ");
        }
    }

    class SumOfGivenSeries {
        static void findSum() {
            Scanner sc = getScanner();
            System.out.println("Enter the no of integers: ");
            int n = sc.nextInt();
            int sum = (n * (n + 1)) / 2;
            System.out.println("Sum:   " + sum);
        }
    }


    public static void main(String[] args) {
        Perfect.findPerfect();
        System.out.println(MaxMinStep.findMaxMinStep());
        LeastTwoGreatestElements.findLeastMaxElements();
        SumOfGivenSeries.findSum();

    }
}
