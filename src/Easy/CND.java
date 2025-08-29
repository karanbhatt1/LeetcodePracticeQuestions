package Easy;
import java.util.*;

class CND {
    public static  boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<len;i++){
            if(hm.containsKey(nums[i])){
                if((Math.abs(hm.get(nums[i]))-i)<=k){
                    return true;
                }
                else{
                    hm.put(nums[i],i);
                }
            }
            else{
                 hm.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        containsNearbyDuplicate(new int[]{1,0,1,1},1);

    }
}