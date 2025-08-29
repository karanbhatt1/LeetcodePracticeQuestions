package cyclesort;
/*
 Leetcode --> 442
 */
import java.util.List;
import java.util.LinkedList;
class Solution {
    public static List<Integer> duplicates(int[] nums) {
        List<Integer> res = new LinkedList<Integer>();
        int i = 0;
        int len = nums.length;
        while (i < len) {
            int cindx = nums[i] - 1;
            if (nums[i] == nums[cindx]) {
                i++;
            } else {
                swap(nums, i, cindx);
            }
        }
        for (int j = 0; j < len; j++) {
            if (j + 1 != nums[j]) {
                res.add(nums[j]);
            }
        }
        return res;

    }

    private static void swap(int[] arr, int i, int ci) {
        int temp = arr[i];
        arr[i] = arr[ci];
        arr[ci] = temp;
    }
}