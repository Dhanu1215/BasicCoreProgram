package com.blp.basiccoreprograms;

import java.util.Scanner;

/**
 * Swap Two Numbers
 */
public class SwapTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enters two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Numbers before swapping = " + num1 + " " + num2);
        SwapTwoNumbers number = new SwapTwoNumbers(); //Create object to store method
        number.swap(num1, num2); //Call method to swap two numbers
    }

    private void swap(int num1, int num2) {  // By making add & sub.
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Numbers after swapping = " + num1 + " " + num2);
    }
}
