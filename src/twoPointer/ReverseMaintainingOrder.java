package twoPointer;

import java.util.Scanner;

// Reverse only letters: https://leetcode.com/problems/reverse-only-letters/description/?envType=problem-list-v2&envId=two-pointers
public class ReverseMaintainingOrder {
    private static String reverse(String str){
        int len = str.length();
        int i = 0;
        int j = len-1;
        char [] arr = str.toCharArray();
        while(i<=j){
            char ci = str.charAt(i);
            char cj = str.charAt(j);
            if(Character.isLetter(ci) && Character.isLetter(cj)){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(!Character.isLetter(ci)){
                i++;
            } else if (!Character.isLetter(cj)) {
                j--;
            }
        }
        return new String(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.nextLine();


        System.out.println(reverse(str));

    }
}
