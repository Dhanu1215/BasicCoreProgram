package com.blp.basiccoreprograms;

import java.util.Scanner;

/**
 * Find Out Large Number From Given Number
 */

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Use Scanner to Read Number
        System.out.println("Enter Numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        LargestNumber number = new LargestNumber();
        number.largeNum(x, y, z);
    }

    private void largeNum(int x, int y, int z) { // Compare Numbers to Get Large Number
        if (x > y && x > z) {
            System.out.println("Largest Number is = " +x);
        }
        if (y > x && y > z) {
            System.out.println("Largest Number is = " +y);
        }
        if (z > x && z > y) {
            System.out.println("Largest Number is = " +z);
        }
    }
}
