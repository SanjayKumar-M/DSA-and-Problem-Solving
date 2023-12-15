package Striver.Arrays.medium;

public class Solution {
    public int maxProfit(int[] prices) {
        //setting buy price as the highest
        int buy_price = Integer.MAX_VALUE;
        // setiing maximum profit to 0 so that later it can change to max profit 
        //as second min and max element approach
        int maxProfit = 0;

        for(int price: prices){
            //if current price is less than buy price then set the price to current buy price
            if(price<buy_price){
                buy_price = price;
            }
            //if it is greater then it can be used to fnd maxprofit
            // it can be easily understood with dry run approach
        else{
            maxProfit = Math.max(maxProfit, price - buy_price);
            }
        }
        return maxProfit;
        
    }
} beststock {
    
}
