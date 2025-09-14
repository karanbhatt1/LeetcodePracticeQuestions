package SlidingWindow;
import java.util.*;
import java.lang.String;
public class CountCompleateSubarray {
        public static int distinctCount(int[] nums){
            Set<Integer> st = new HashSet<>();
            for(int i: nums){
                st.add(i);
            }
            return st.size();
        }

        public static int fun(int[]nums){
            int dis = distinctCount(nums);
            int right = 0;
            int left = 0;
            int len = nums.length;
            HashMap<Integer,Integer> fre = new HashMap<>();
            int cont = 0;
            int count = 0;
            while(right<len){
                fre.put(nums[right], fre.getOrDefault(fre.get(nums[right]),0)+1);
                while(fre.size() == dis){
                    cont = len - right;
                    count += cont;
                    fre.put(nums[left],fre.getOrDefault(nums[left],0)-1);
                    if(fre.get(nums[left])== 0){
                        fre.remove(nums[left]);
                    }
                    left++;
                }
                right++;
            }
            return count;
        }
        public static int countCompleteSubarrays(int[] nums) {
            return fun(nums);
        }
    public static void main(String[] args) {
            StringBuilder res  = new StringBuilder();
            
        System.out.println(countCompleteSubarrays(new int[]{1,3,1,2,2}));
    }
}
