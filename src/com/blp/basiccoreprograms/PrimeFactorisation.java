package com.blp.basiccoreprograms;

import java.util.Scanner;

/**
 * Print Prime Factors of Given Number
 */
public class PrimeFactorisation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int number = sc.nextInt();
        calculatePrimeFactor(number); // Call function to calculate prime factor
    }
    private static void calculatePrimeFactor(int number) {
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.print(i + " * ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.print(number);
        }
    }
}
