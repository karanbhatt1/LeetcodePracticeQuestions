package Greedy;
public class JumpGame2 {
    private static int findMax(int[] nums, int st, int end){
        int maxReach = -1;
        int indx = st;
        for(int i=st;i<=end;i++){
            int reach = nums[i] + i;
            if(reach > maxReach){
                maxReach = reach;
                indx = i;
            }
        }
        return indx;
    }
    private static int minimumJumps(int[] nums){
        int len = nums.length;
        if(len==1){
            return 0;
        }
        int jC = 0;
        int i=0;
        int maxIndx = Integer.MIN_VALUE;
        while(i < len){
            int reach = nums[i] + i;
            maxIndx = Math.max(reach,maxIndx);
            if(maxIndx+1 >= len){
                jC++;
                break;
            }
            if(maxIndx < len-1) {
                i = findMax(nums, i+1 , reach);
                jC++;
            }
        }
        return jC;
    }
    public static  int jump(int[] nums) {
        return minimumJumps(nums);
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{1,2,1,1,1}));
    }
}