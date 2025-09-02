package SlidingWindow;
///  # Return a subarray with maximum sum.
/// The array may contain -ve , 0 and +ve no.
/// ## This is the application of kadane algorithm.
/// <br>
/// <br>
/// # What is the concept?
/// 1. If there are negative no and i want to maximize the sum so i can take max of either the currNo ---><br>
/// .----> CurrentNo 1. Can be +ve no , Can be -ve no.
///  Math.max (curr,curr+arratthisindx); <h1>Why?</h1>
///  max = Math.max\(max,curr); either the no at index or sum till that index.
///
public class MaximumSum {
    public static int fun(int[] nums){
        int len = nums.length;
        int max = nums[0];
        int currMax = 0;
        for(int i=0;i<len;i++){
            currMax = Math.max(nums[i],currMax+nums[i]);
            max  = Math.max(currMax,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,-9,21,-3,10,0};
        System.out.println(fun(nums));
    }
}

