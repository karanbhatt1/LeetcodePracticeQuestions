package medium;

import java.util.Arrays;
// LeetCode --> 128 https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSubSequece {

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1;
        int maxCnt = 1;
        int len = nums.length;
        if(len==0){
            return 0;
        }
        for(int i=1;i<len;i++){
            int currElem = nums[i];
            int last_Elem = nums[i-1];
            if(currElem == last_Elem){
                continue;
            }
            else if(currElem == last_Elem + 1){
                cnt++;
            }
            else{
                cnt = 1;
            }
            maxCnt = Math.max(cnt,maxCnt);
        }
        return maxCnt;
    }
    public static void main(String[] args) {

    }
}
