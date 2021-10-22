package com.blp.basiccoreprograms;

import java.util.Scanner;

/**
 * Calculate Quotient and Reminder
 */

public class QuotientAndReminder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Use scanner to Read numbers
        System.out.println("Enter two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        calculateQuotientAndReminder(x, y); // Call method to calculate Quotient and Reminder
    }
    private static void calculateQuotientAndReminder(int x, int y) {
        System.out.println("Quotient = " + (x / y) + " Reminder = " + (x % y));
    }
}

