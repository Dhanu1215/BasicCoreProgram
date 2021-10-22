package com.blp.basiccoreprograms;

/**
 * Flip Coin and Print Percentage of Head and Tail
 */
public class FlipCoin {
    int count1 = 0;
    int count2 = 0;
    int head = 0;

    public static void main(String[] args) {
        FlipCoin coin = new FlipCoin();
        coin.flip();
        System.out.println("Percentage of Heads and Tails is = " + coin.percentage() + " " + "&" + " " + (100 - coin.percentage()));
    }

    private void flip() {
        int numOfFlip;
        for (numOfFlip = 1; numOfFlip <= 50; numOfFlip++) {
            int randomNum = (int) (Math.floor(Math.random() * 10) % 2);
            if (randomNum == head) {
                count1++;
            } else
                count2++;
        }
    }

    private double percentage() {
        double perHead = ((double) count1 / 50) * 100;
        return (perHead);
    }
}

