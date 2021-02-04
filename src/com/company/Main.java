package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int i = 0;
    static int[] elements = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5}; // for task 2
    static byte[] myArray = new byte[10]; // for task 3

    public static void main(String[] args) {


        int[] newArray = {5, 3, 7, 6, 2, 8};

        for (i = 0; i < newArray.length; i++)
            System.out.println(newArray[i]);

        for (int myVar : newArray)
            System.out.println(myVar); //Best for this assignment

        while (i < newArray.length) {
            System.out.println(newArray[i]);
            i++;
        }
        i = 0;
        do {
            System.out.println(newArray[i]);
            i++;
        } while (i < newArray.length);

        Assignment2();
        Assignment3();

    }

    public static void Assignment2() {
        int oddCount = 0;

        for (i = 0; i < elements.length; i++) {
            if (elements[i] < 0) {
                System.out.println("Negative element " + elements[i]);
            }
        }

        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.println("Odd element: " + myArray[i]);
                oddCount++;
            }
        }
        System.out.println("Amount of odd numbers are: " + oddCount);

        System.out.println("Are there multiple elements with the same value? " + checkDuplicateUsingSet());

        for (i = 0; i < elements.length; i += 2) {
            System.out.println("Every 2nd element " + elements[i]);
        }


        int sum = 0;
        int smallerThenAvrage = 0;
        for (i = 0; i < elements.length; i++) {
            sum = sum + myArray[i];
            if (myArray[i] <= ((double) sum / elements.length)) {
                smallerThenAvrage++;
            }
        }
        System.out.println("Average value of array: " + ((double) sum / elements.length));


        System.out.println("This element is smaller then average value " + smallerThenAvrage);
    }


    public static boolean checkDuplicateUsingSet() {
        List inputList = Arrays.asList(elements);
        Set inputSet = new HashSet(inputList);
        if (inputSet.size() < inputList.size()) {
            return true;
        }
        return false;
    }

    static void Assignment3() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 grades: ");
        for (int i = 0; i < myArray.length; i++) {

            while (!scanner.hasNextByte()) {
                System.out.println("That's not a number! Enter valid grade:");
                scanner.next();
            }

            byte element = scanner.nextByte();
            if ((element <= 10 && element >= 0)) {
                myArray[i] = element;
            } else {
                i--;
                System.out.println("Please, enter valid value!");
            }
        }
// histogram
        int[] grades = new int[11];
        int counter = 0;
        for (i = 0; i < grades.length; i++) {
            counter = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (i == myArray[j]) {
                    counter++;
                }
            }
            grades[i] = counter;
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i] + " students with the grade " + i);
        }

        System.out.println(Failed() + " students failed, but " + GotA() + " students got A mark.");
    }


    public static int Failed() {
        int count = 0;
        for (int i : myArray) {
            if (i < 4) {
                count++;
            }
        }
        return count;
    }

    public static int GotA() {
        int a = 0;
        for (int i : myArray) {
            if (i == 10) {
                a++;
            }
        }
        return a;
    }
}
























