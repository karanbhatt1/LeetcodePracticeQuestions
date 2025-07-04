package medium;

public class WiggleSort {
    /**
     *
     * nums[0] <= nums[1] => nums[2] <= nums[3] => nums[4]
     */
    public static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,5,7,9,8};
        int len = nums.length;
        for(int i=1;i<len;i++){
            if( ( (i&1)==1  && nums[i] < nums[i-1]) || ( (i&1)==0 && nums[i] > nums[i-1]) ){
                swap(nums,i,i-1); // swap the positions;
            }
        }
    }
}
