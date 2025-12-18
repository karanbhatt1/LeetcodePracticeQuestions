package Dp;
import java.lang.reflect.Array;
import java.util.*;
/// # Writing Tabulation Using Recursion.
///  # Steps :
///     1.   Make an array of same size as created in memoization.
/// <br>
///     2.   Then first write the base cases.
/// <br>
///     3.   Then write a nested loop then write the recursive code as it is.
/// <br>
///     4.   Return dp\[len-1\]\[k\]; where k is the target.
public class PartitionEqualSubsetSum {
    public static boolean fun(int[]arr,int indx,int target){
        if(arr.length % 2!=0){
            return false;
        }
        if(target==0){
            return true;
        }
        if(indx==arr.length-1){
            return arr[indx] == target;
        }
        boolean notTake = fun(arr,indx+1,target);
        boolean take = false;
        if(arr[indx] >= target){
            take = fun(arr,indx+1,target-arr[indx]);
        }
        return take || notTake;
   }
    public static boolean funDp(int[]arr,int target){
        boolean[][] dp = new boolean[arr.length][target+1];
        ///  # STEP:
        ///  1. Intialize dp with false;
        for(boolean [] d: dp){
            Arrays.fill(d,false);
        }
        for(int i=0;i<arr.length;i++){
            dp[i][0] = true;
        }
        if(arr[0]<=target){
            dp[0][arr[0]] = true;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<target+1;j++){
                boolean notTake = dp[i-1][j];
                boolean take = false;
                if(arr[i]<=j){
                    take = dp[i-1][j-arr[i]];
                }
                dp[i][j] = take || notTake;
            }
        }
        return dp[arr.length-1][target];
    }
   public static void main(String[] args){
        int[] arr = {1,3,5};
        int totalSum=0;
        for(int i: arr){
            totalSum+=i;
        }
       System.out.println(fun(arr,0,(int)totalSum/2));
   }
}
