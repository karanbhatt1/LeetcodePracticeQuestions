package Dp;

import java.util.Arrays;

/// # DP
/// 1. We need to count the total subset with sum k
/// Subset is part of array where element can be deleted in between but in order.
/// i.e. POWERSET
/// \[1,2,3,4,5,6,7]
/// Subset --> \[1,2,3\],\[3,5,7],\[1,4,7]
public class CountSubsetWithSumK {
    ///  Memoizing the Solution.
    public static int fun(int[] arr, int indx, int target,int[][]dp){
        if(target==0){
            return 1;
        }
        if(indx==0){
            if(arr[indx]==target){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[indx][target] != -1){
            return dp[indx][target];
        }
        int notPick = fun(arr,indx-1,target,dp);
        int pick = 0;
        if(arr[indx]<=target){
            pick = fun(arr,indx-1,target-arr[indx],dp);
        }
        return dp[indx][target]= pick+notPick;
    }


    public static  void main(String[] args){
        int[] arr = {28 ,4 ,3 ,27 ,0 ,24 ,26};
        int target = 24;
        int[][] dp = new int[arr.length][target+1];
        for(int [] d: dp){
            Arrays.fill(d,-1);
        }
        System.out.println(fun(arr,arr.length-1,3,dp));
    }
}
