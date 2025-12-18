package string_Based;
import java.util.*;
class Solution {
    public static String process(String st){
        StringBuilder res = new StringBuilder();
        int count = 0;
        int i = 0;
        while(i < st.length()){
            count = 1;
            while(i < st.length()-1 && st.charAt(i) == st.charAt(i+1)){
                i++;
                count++;
            }
            res.append(count);
            res.append(st.charAt(i));
            i++;
        }
        return res.toString();
    }
    public static  String fun(int n){
        if(n==1){
            return "1";
        }
        String str = fun(n-1);
        return process(str);
    }
    public String countAndSay(int n) {
        return fun(n);
    }
}

public class CountAndSay {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.countAndSay(8));
    }
}
