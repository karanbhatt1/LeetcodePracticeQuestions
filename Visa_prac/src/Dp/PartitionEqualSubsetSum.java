package Dp;
import java.util.*;
///  Writing Tabulation Using Recurssion.
///
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
   public static void main(String[] args){
        int[] arr = {1,3,5};
        int totalSum=0;
        for(int i: arr){
            totalSum+=i;
        }
       System.out.println(fun(arr,0,(int)totalSum/2));
   }
}
