package medium;

public class JumpGame {
    public boolean canJump(int[] nums) {

        int maxIndx= 0;
        for(int i=0;i<nums.length;i++){
            if(maxIndx>=nums.length-1){
                return true;
            }
            if(i>maxIndx){
                return false;
            }
            int reach = i+ nums[i];
            maxIndx = Math.max(maxIndx,reach);
        }
        return true;
    }
    public static void main(String[] args) {
        int [] nums = {3,2,1,0,4};
        JumpGame jg = new JumpGame();
        System.out.print(jg.canJump(nums));
    }
}
