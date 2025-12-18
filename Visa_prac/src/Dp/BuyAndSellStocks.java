package Dp;
/// We are allowed to buy and stocks only once.
/// And we need to find the maximum profit we get.
/// It can be done in o\(n\).
public class BuyAndSellStocks {
    public static int  maxProfit(int[]arr){
        ///  Arr is the array contating the prices for n days.
        ///  The ith position is price for ith day. i.e. arr\[i\]
        int miniElement = arr[0];
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            int cost = arr[i] - miniElement;
            profit = Math.max(cost,profit);
            miniElement = Math.min(miniElement,arr[i]);
        }
        return profit;
    }
    public static void main(String[]args){
        System.out.println(maxProfit(new int[]{7,5,1,8,9,4,3,19,100}));
    }
}
