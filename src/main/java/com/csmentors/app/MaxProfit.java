package com.csmentors.app;

public class MaxProfit {
    public static void main( String[] args ) { System.out.println( "ReverseLinkedList test" ); }

    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = -1;
        while (right <= prices.length) {
            if (prices[left] < prices[right]) {
                right++;
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
                right++;
            }
        }
        return maxProfit;
    }
}
