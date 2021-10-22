package com.blp.basiccoreprograms;

import java.util.Scanner;

/**
 * Check Year is Leap Year or Not
 */

public class LeapYear {

    public static void main(String[] args) {
        //Use scanner to read year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        LeapYear leapYear = new LeapYear();
        leapYear.display(year);
    }

    private void display(int year) {
        // Check year is leap year or not
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("year is leap year");
        } else
            System.out.println("year is not leap year");
    }
}
