package String;


import java.util.*;

public class Sum_Of_Beauty_Of_All_Substrings {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.beautySum("aabcb"));
    }
}



class Solution {
    private static int min(int[] li){
        int min  = Integer.MAX_VALUE;
        for(int i : li){
            if(i<min && i!=0){
                min = i;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }

    private static int max(int[] li){
        int max = li[0];
        for(int i:li){
            if(i>max){
                max = i;
            }
        }
        return max==0 ? -1 :max;
    }



    public int beautySum(String s) {
        if(s.length() == 1){
            return 0;
        }

        int[] arr = new int[26];
        int res = 0;
        int beauty = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            Arrays.fill(arr,0);
            for(int j=i;j<len;j++){
                char ch = s.charAt(j);
                arr[ch - 'a']++;
                int minF = min(arr);
                int maxF = max(arr);
                if(minF!= -1 && maxF != -1){
                    beauty += maxF - minF;
                }
            }
        }
        return beauty;
    }
}