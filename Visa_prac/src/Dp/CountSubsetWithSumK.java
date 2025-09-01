package Dp;
/// # DP
/// 1. We need to count the total subset with sum k
/// Subset is part of array where element can be deleted in between but in order.
/// i.e. POWERSET
/// \[1,2,3,4,5,6,7]
/// Subset --> \[1,2,3\],\[3,5,7],\[1,4,7]
public class CountSubsetWithSumK {
    public static int fun(int[] arr, int indx, int target){
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
        int notPick = fun(arr,indx-1,target);
        int pick = 0;
        if(arr[indx]<=target){
            pick = fun(arr,indx-1,target-arr[indx]);
        }
        return pick+notPick;
    }

    public static  void main(String[] args){
        int[] arr = {1,2,2,3,2};
        System.out.println(fun(arr,arr.length-1,3));
    }
}
