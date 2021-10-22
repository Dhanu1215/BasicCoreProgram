package com.blp.basiccoreprograms;

import java.util.Scanner;

/**
 * Print power of two
 */

public class PowerOf2 {

    public static void main(String[] args) {
        // Use scanner to read the number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        PowerOf2 pow = new PowerOf2();//Create object to call method
        pow.display(num);//Call method to print power of two
    }

    private void display(int num) {
        //Declaring and Initializing variables
        if (num < 31) {
            int powerOf2 = 0;
            for (int i = 0; i <= num; i++) { //Use loop to get power
                powerOf2 = (int) Math.floor(Math.pow(2, i));
                System.out.println("power of 2 = " + powerOf2);
            }
        }
    }
}