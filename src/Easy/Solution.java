package Easy;

public class Solution {
    // Day --- price.

    public static  int [] maxPrice(int [] p, int stindx, int len, int currprice){
        int max = Integer.MIN_VALUE;
        int indx = -1;
        for(int i=stindx+1 ; i<len ; i++){
            if(p[i]>max){
                max=p[i];
                indx = i;
            }
        }
        return max==Integer.MIN_VALUE ? new int[] {-1,-1} : new int[] {indx,max};
    }
    public static int[] minPrice(int[] p){
        int len = p.length;
        int min = Integer.MAX_VALUE;
        
        int indx = -1;
        for(int i=0;i<len;i++){
            if(p[i] < min){
                min = p[i];
                indx = i;
            }
        }
        return new int[] { indx,min};

    }
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        int[] minPrice = minPrice(prices);
        int [] maxPrice = maxPrice(prices,minPrice[0],len,minPrice[1]);

        if(maxPrice[0] > minPrice[0]){
            return maxPrice[1] - minPrice[1];
        }
        return 0;


        
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {8,2,6,9,10,4,7,80}));
    }
}