package com.blp.basiccoreprograms;

import java.util.Scanner;

/**
 * Check Number is Even or Odd
 */
public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Use Scanner to Read the Number
        System.out.println("Enter Number");
        int num = sc.nextInt();
        EvenOrOddNumber number = new EvenOrOddNumber();
        number.check(num);
    }

    private void check(int num) {
        int a = num % 2; // Calculate reminder
        if (a == 0) {    // Check Number is Even Or Odd
            System.out.println("Number is Even Number");
        } else
            System.out.println("Number is Odd Number");
    }
}

