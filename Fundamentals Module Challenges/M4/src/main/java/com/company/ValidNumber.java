package com.company;

import java.util.Scanner;

public class ValidNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10.\n");

        int num = Integer.parseInt(scan.nextLine());

        while (num < 1 || num > 10) {
            System.out.println("You must enter a number between 1 and 10. Please try again.\n");
            num = Integer.parseInt(scan.nextLine());
        }

        System.out.println("Your number is " + num + ".\n");

    }
}
