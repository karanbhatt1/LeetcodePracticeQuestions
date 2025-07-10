package slidingWindow;

import java.util.HashMap;

public class NumSubarrayWithSum {
    static int countSubarrayWithSum(int[] nums, int goal){
        int len = nums.length;
        HashMap<Integer,Integer> prefre = new HashMap<>();

        int currSum = 0;
        int end = 0;
        int res = 0;
        prefre.put(currSum,1);

        while(end<len){
            currSum += nums[end];
            int prefix = currSum - goal;
            if(prefre.containsKey(prefix)){
                res += prefre.getOrDefault(prefix,0);
            }
            prefre.put(currSum,(prefre.getOrDefault(currSum,0)+1));
            end++;
        }
        return res;
    }
    public static void main(String[] args){
        int [] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(countSubarrayWithSum(nums,goal));
    }
}
