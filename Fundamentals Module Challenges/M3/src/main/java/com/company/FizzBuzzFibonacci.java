package com.company;

import java.util.Scanner;

public class FizzBuzzFibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstNum = 0;
        int secondNum = 0;

        // Ask for first number, checking if the input is an integer and exiting if it's not
        try {
            System.out.println("Please enter an integer.");
            firstNum = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException error) {
            System.out.println("ERROR - Input is not a valid integer. Exiting...");
            return;
        }

        // Ask for second number, checking if the input is an integer and exiting if it's not
        try {
            System.out.println("Please enter another integer.");
            secondNum = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException error) {
            System.out.println("ERROR - Input is not a valid integer. Exiting...");
            return;
        }

        // FizzBuzz
        System.out.println("\nFizzBuzz");
        System.out.println("==========");
        for (int i = 1; i <= firstNum; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }

        // Fibonacci
        System.out.println("\nFibonacci");
        System.out.println("==========");

        int fibs[] = new int[secondNum];
        fibs[0] = 0;
        fibs[1] = 1;
        System.out.print(fibs[0] + " " + fibs[1] + " ");

        for (int j = 2; j < secondNum; j++) {
            fibs[j] = fibs[j-1] + fibs[j-2];
            System.out.print(fibs[j] + " ");
        }
    }
}
