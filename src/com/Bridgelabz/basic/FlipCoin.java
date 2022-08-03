package com.Bridgelabz.basic;

public class FlipCoin {
    public FlipCoin() {
}

    public static void main(String[] args) {
        int lC = 1;

        double heads;
        for(heads = 0.0; lC <= 1000; ++lC) {
            double result = Math.random();
            if (result <= 0.5) {
                ++heads;
            }
        }

        double percentHeads = heads / 1000.0 * 100.0;
        double percentTails = (1000.0 - heads) / 1000.0 * 100.0;
        System.out.println("percentage of heads is: " + percentHeads);
        System.out.println("percentage of tails is: " + percentTails);
    }
}

