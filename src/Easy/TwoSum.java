package Easy;
import java.util.*;
//leetcode --> 1;
public class TwoSum {
    private static boolean ts(int[] arr, int target) {
        int len = arr.length;
        int i = 0;
        int sum = 0;
        int j = len;
        while (i < j) {
            sum = arr[i] + arr[j];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

    }
}

