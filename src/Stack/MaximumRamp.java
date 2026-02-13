package Stack;

import java.util.List;
import java.util.Stack;



public class MaximumRamp {
    public static int maxWidthRamp(int[] nums) {
        // Monotonicity : identification.

        Stack<Integer> indx = new Stack<>();
        int ramp = 0;
        int len = nums.length;

        for(int i=0;i<len;i++){
            if(indx.isEmpty()){
                indx.add(i);
            }
            else if(nums[i] <= nums[indx.peek()]){
                indx.add(i);
            }
        }

        int j = len-1;

        while(!indx.isEmpty() && j!=-1){
            int top = indx.peek();

            if(nums[top] <= nums[j] && top<j){
                ramp = Math.max(ramp,j-top);
                indx.pop();
            }

            else if(nums[top] > nums[j]){
                j--;
            }
            if(j==top){
                indx.pop();
            }

        }
        return ramp;
    }
    public static void main(String[] args) {
        maxWidthRamp(new int[]{6,1,1,8,9,1,5});
    }
}
