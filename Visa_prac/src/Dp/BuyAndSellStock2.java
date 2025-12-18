package Dp;

import java.util.Arrays;

///  # DP
/// Here we are allowed to buy and sell stock multiple time but first we have to buy then sell.
/// we cant sell before buying. and we cant buy before selling.
/// # Intution
/// 1. At a particular day i can either buy the stock or not buy. <br>
/// > if i buy the stock then i will have profit of   Max\(-price\[i]+ fun\(indx+1,0\), 0+fun\(indx+1,1\)\)
///
public class BuyAndSellStock2 {
    public static int fun(int[]prices,int indx,int buy,int[][] dp){  ///  if i can buy then its 1 else 0.
        if(indx==prices.length){
            return 0;
        }
        if(dp[indx][buy] != -1){
            return dp[indx][buy];
        }
        int profit = 0;
        if(buy == 1){
            profit =  Math.max(-prices[indx] + fun(prices,indx+1,0,dp) , 0+fun(prices,indx+1,1,dp));
        }
        else {
            profit = Math.max(prices[indx] + fun(prices, indx + 1, 1,dp), 0 + fun(prices, indx + 1, 0,dp));
        }
        return dp[indx][buy] =  profit;
    }
    public static void main(String[] args) {
        int []  arr = {7,1,5,3,6,4};
        int len = arr.length;
        int[][]dp = new int[len][2];
        for(int [] d:dp){
            Arrays.fill(d,-1);
        }
        System.out.println(fun(new int[]{7,1,5,3,6,4},0,1,dp));
    }
}
