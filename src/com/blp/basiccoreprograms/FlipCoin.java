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
        //Create object to call method
        coin.flip();
        //Call method to get count of head and tail
        System.out.println("Percentage of Heads and Tails is = " + coin.percentage() + " " + "&" + " " + (100 - coin.percentage()));
    }

    private void flip() {
        int numOfFlip;
        //Use for loop to get count
        for (numOfFlip = 1; numOfFlip <= 50; numOfFlip++) {
            int randomNum = (int) (Math.floor(Math.random() * 10) % 2);
            if (randomNum == head) {
                count1++;
            } else
                count2++;
        }
    }
    // Calculate percentage of head and tail
    private double percentage() {
        double perHead = ((double) count1 / 50) * 100;
        return (perHead);
    }
}

