package twoPointer;
import java.util.*;
/** --> leetcode: 15
 * Intution: one way is to iterate with 3 loops and generate all the triplets but it results in o(n^3);
 *
 *
 * >>>>>Approach 2:
 * So we use sliding window and 2 pointer:
 * ->which needs sorting of array;
 * ->Then iterate in array with pointer i to n-2 (to eliminate the limit of 3)
 * ->Then take pointer j = i+1 k= len-1;
 * ---> if(i>0 && nums[i]==nums[i-1]) continue; as the elements are repeating;
 * 1-> Add i+j+k if sum ==0 then add it into the list;
 * 2--> to eliminate the duplicate elements we need that j<k and nums[j] !=nums[j+1] also nums[k] != nums[k-1]; if so increase j++,k--;
 * 3-> if not increase j;
 * 4-> if sum< 0 then j++;
 * 5-> else k--;
 * Repeat the steps 1-5;
 */
public class TwoSum2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int k= len-1;
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<len-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j=i+1;
            k=len-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k])); // to add a list inside list we can use
                    // .add(Arrays.asList(<elements>);
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }

            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
