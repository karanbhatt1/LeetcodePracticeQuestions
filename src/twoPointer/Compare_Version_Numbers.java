package twoPointer;

import java.util.Scanner;

// Leetcode 165  = https://leetcode.com/problems/compare-version-numbers/description/?envType=problem-list-v2&envId=two-pointers
public class Compare_Version_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s1 = new Solution();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(s1.compareVersion(str1, str2));
    }
}


class Solution {
    private int fun(String s1, String s2){


        String[] arr1 = s1.split("\\.");
        String[] arr2 = s2.split("\\.");

        int len1 = arr1.length;
        int len2 = arr2.length;

        int i=0;
        int j = 0;

        while(i<len1-1 && j<len2-1){
            int a = Integer.parseInt(arr1[i]);
            int b = Integer.parseInt(arr2[j]);
            if(a<b){
                return -1;
            }
            else if(a>b){
                return 1;
            }
            ++i;
            ++j;
        }
        return 0;
    }
    public int compareVersion(String version1, String version2) {
        return fun(version1, version2);
    }
}