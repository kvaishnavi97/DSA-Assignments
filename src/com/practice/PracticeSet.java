package com.practice;

import java.util.Scanner;

import static com.practice.Util.getScanner;
import static com.practice.Util.takeArrayInput;

public class PracticeSet {

    class SumOfIntegers {

        static void doSum() {
            Scanner sc = getScanner();
            System.out.println("Enter the no of integers: ");
            int n = sc.nextInt();
            int[] array = takeArrayInput(sc, n);
            if (n == 0 || n == 1) {
                System.out.println("Sum requires at least 2 nos");
                return;
            }
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Sum of Given Integers: " + sum);
        }
    }



    class FindIndexOfArray {

        static int findIndex() {
            Scanner sc = getScanner();
            System.out.println("Enter no of integers and index key: ");
            int n = sc.nextInt();
            int index = sc.nextInt();
            int[] array = takeArrayInput(sc, n);
            if (index > array.length) {
                System.out.println("Index is out of bound og given array: ");
                return -1;
            } else {
                return array[index];
            }
        }

    }

    class FindElementsLessThanGivenNo {
        static void findLessThanElements() {
            Scanner sc = getScanner();
            System.out.println("Enter no of elements: ");
            int n = sc.nextInt();
            int[] array = takeArrayInput(sc, n);
            System.out.println("Enter the element: ");
            int element = sc.nextInt();

            int index=findIndex(array, element);
            if(index == -1)
                System.out.println("Element is not present in an array");
            else
                System.out.println("No of elements which are less than given no "+element+" are "+(index+1));

        }

        private static int findIndex(int[] array, int element) {
            int low = 0, high = array.length - 1, mid;
            while (low <= high) {
                mid = (low + high) / 2;
                if (array[mid] == element) {
                    return mid;
                } else if (element > array[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }
    }

    class AlternateOrder{
         static void printAlternateOrder(){
             Scanner sc = getScanner();
             System.out.println("Enter no of elements: ");
             int n = sc.nextInt();
             int[] array = takeArrayInput(sc, n);
             int i=0;
             while(i<=array.length-1){
                 System.out.print(array[i]+" ");
                 i=i+2;
             }

         }
    }

    class ValueSameAsIndex{

        static void findValueSameAsIndex(){
            Scanner sc = getScanner();
            System.out.println("Enter no of elements: ");
            int n = sc.nextInt();
            int[] array = takeArrayInput(sc, n);
            for(int i=0;i<array.length;i++){
                if(array[i] == i+1){
                    System.out.print(array[i]+" ");
                }
            }

        }
    }

    public static void main(String[] args) {
        // SumOfIntegers.doSum();
        //System.out.println("Indexed element: " + FindIndexOfArray.findIndex());
        //FindElementsLessThanGivenNo.findLessThanElements();
        //AlternateOrder.printAlternateOrder();
        ValueSameAsIndex.findValueSameAsIndex();

    }
}
