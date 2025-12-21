package twoPointer;

import java.util.Arrays;

class Fiwivd{
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int [] res = new int[2];
        Arrays.fill(res,-1);

        int min = 0, max = 0;  // index

        for(int i=0,j=indexDifference;j<nums.length;j++,i++){
            if(nums[min] > nums[i]){
                min = i;
            }
            else if(nums[max] <  nums[i]){
                max = i;
            }

            if(Math.abs(nums[min] - nums[j])>= valueDifference){
                res[0] = min;
                res[1] = j;
                break;
            }
            else if(Math.abs(nums[max] - nums[j])>= valueDifference){
                res[0] = max;
                res[1] = j;
                break;
            }
        }

        return res;
    }
}
public class Find_Indices_With_Index_And_Value_Difference {
    public static void main(String[] args) {
        Fiwivd s1  = new Fiwivd();
        int[] nums = {5,1,4,1};
        int id = 2;
        int vd = 4;
        System.out.println(s1.findIndices(nums,2,4));
    }
}
