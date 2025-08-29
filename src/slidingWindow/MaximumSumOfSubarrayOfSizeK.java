package slidingWindow;

public class MaximumSumOfSubarrayOfSizeK {
    /**
     * A range of window is given by R-L+1;
     *
    **/
    private static int ms(int[]nums,int k){
        int len = nums.length;
        int l=0;
        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<k;i++){
            sum +=sum+nums[i];
        }
        int cursum = sum;
        int r = k;
        while(r<len){
            cursum +=nums[r]-nums[r-k];
            sum = Math.max(sum, cursum);
            r++;
        }
        return (sum);
    }
    public static void main(String[] args) {
        ms(new int[]{100,200,300,400},2);

    }
}
