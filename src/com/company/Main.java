package com.company;

import java.util.*;

public class Main {
    static int i = 0;
    static int[] elements = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5}; // for task 2
    static byte[] myArray = new byte[10]; // for task 3

    public static void main(String[] args) {

        Assignment1();
        Assignment2();
        Assignment3();

        // for task 5
        int[] arrayforreverse = {1, 2, 3, 4, 5, 6};
        printArray(arrayforreverse, 6);
        reverse(arrayforreverse, 0, 5);
        System.out.print("Reversed array is ");
        printArray(arrayforreverse, 6);

        Assignment_6();
        Assignment_7();
    }

    public static void Assignment1() {
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
            System.out.println("Every 2nd element ");
            System.out.println(elements[i]);
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
        return inputSet.size() < inputList.size();
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
        System.out.println(Failed() + " students failed, but " + GotA() + " students got A mark.");
        Histogram();
    }


    public static void Histogram() {
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


    static void reverse(int[] array, int start,int end){

        int temp;

        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

    }

    static void printArray(int[] arr,
                           int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


        public static void Assignment_6 () {
//Given a 2D square matrix, print the Principal and Secondary diagonals.

            int n = 4;
            int[][] ArrayA = {{1, 2, 3, 4},
                    {4, 3, 2, 1},
                    {7, 8, 9, 6},
                    {6, 5, 4, 3}};

            printPrincipalDiagonal(ArrayA, n);
            printSecondaryDiagonal(ArrayA, n);

            int columns = 6;
            int[][] arrayB = {{505, 225, 418, 283, 813, 965},
                    {802, 747, 969, 309, 871, 265},
                    {680, 609, 690, 930, 504, 747},
                    {117, 862, 860, 700, 901, 720},
                    {695, 394, 180, 524, 293, 528},
                    {934, 154, 303, 401, 795, 923}};
            printPrincipalDiagonal(arrayB, columns);
            printSecondaryDiagonal(arrayB, columns);
        }
        static void printPrincipalDiagonal (int[][] mat, int n)
        {
            System.out.print("Principal Diagonal: ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    // Condition for principal diagonal
                    if (i == j) {
                        System.out.print(mat[i][j] + ", ");
                    }
                }
            }

        }

        // Function to print the Secondary Diagonal
        static void printSecondaryDiagonal (int[][] mat, int n)
        {
            System.out.print("Secondary Diagonal: ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    // Condition for secondary diagonal
                    if ((i + j) == (n - 1)) {
                        System.out.print(mat[i][j] + ", ");
                    }
                }
            }

        }


        public static void Assignment_7 () {

            Scanner inp = new Scanner(System.in);
            System.out.println("Please enter number to check if it is palindrome:");
            int num = inp.nextInt();
            System.out.println(isPalindrome(num));
        }
        public static boolean isPalindrome ( int integer){
            int palindrome = integer;
            int reverse = 0;


            while (palindrome != 0) {
                int remainder = palindrome % 10;
                reverse = reverse * 10 + remainder;
                palindrome = palindrome / 10;
            }

            return integer == reverse;
        }
    }
























