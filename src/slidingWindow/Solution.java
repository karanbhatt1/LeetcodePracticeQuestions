package slidingWindow;

class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int len = nums.length;
        int minSp = Integer.MAX_VALUE;
        int left = 0;
        int r = 0;
        int sum = 0;
        while(left<r){
            if(sum>=target){
                sum -=  nums[left];
                minSp = Math.min(minSp,r-left+1);
                left++;
            }
            if(r==len-1 && sum <=target ){
                break;
            }
            else{
                sum +=nums[r];
                r++;
                if(i==r){
                    sum=0;
                }
            }
        }
        return (minSp==Integer.MAX_VALUE)?0:minSp;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        minSubArrayLen(7, arr);
    }
}