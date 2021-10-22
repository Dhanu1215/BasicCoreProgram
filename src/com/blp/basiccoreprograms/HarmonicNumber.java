package com.blp.basiccoreprograms;

import java.util.Scanner;

/**
 * Print N th Order Harmonic Number
 */
public class HarmonicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Use scanner to read number
        System.out.println("Enter Number");
        int num = sc.nextInt();
        HarmonicNumber number = new HarmonicNumber(); //Create object to call method
        number.getSeries(num); //Call method to get harmonic number
    }

    private void getSeries(int num) {
        double series = 0;
        for (int i = 1; i <= num; i++) {
            series = (double) 1 / i;
        }
        System.out.print("Nth Harmonic number value = " + series);
    }
}

