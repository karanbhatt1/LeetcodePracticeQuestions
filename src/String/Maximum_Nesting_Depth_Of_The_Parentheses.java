package String;

import java.util.Scanner;

// 1614 --> https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
public class Maximum_Nesting_Depth_Of_The_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(fun(str));
    }

    private static int fun(String str) {
        int len = str.length();
        int currDepth = 0;
        int maxD  = Integer.MIN_VALUE;
        for(char ch : str.toCharArray()){
            if(ch == '('){
                currDepth++;
            }else if (ch == ')'){
                currDepth--;
            }
            maxD = Math.max(maxD,currDepth);
        }
        return  maxD;
    }
}
