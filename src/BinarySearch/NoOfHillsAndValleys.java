package BinarySearch;

/**
 * Leetcode --> 2210 NoOfHillsAndValleys
 **/

public class NoOfHillsAndValleys {
    private static int lCN(int[]nums,int element,int indx){
        for(int i=indx-1;i>=0;i--){
            if(nums[i]!=element){
                return nums[i];
            }
        }
        return nums[indx];
    }
    private static int rCN(int [] nums,int element,int indx){
        int len = nums.length;
        for(int i=indx+1;i<len;i++){
            if(nums[i]!=element){
                return nums[i];
            }
        }
        return nums[indx];
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,6,4};
        int cs;
        int count=0;
        int len = nums.length;
        for(int j=1;j<len-1;j++){
            int leftClosest = lCN(nums,nums[j],j);
            int rightClosest = rCN(nums,nums[j],j);
            if(nums[j]==nums[j-1]){
                continue;
            }
            if((nums[j]>leftClosest && nums[j]>rightClosest)||(nums[j]<leftClosest && nums[j]<rightClosest)){
                count++;
            }
        }
        System.out.println(count);
    }

}
