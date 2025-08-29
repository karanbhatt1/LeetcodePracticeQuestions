package Easy;
import java.util.*;
// Leetcode --> 3 "LONGEST SUBSTRING WITHOUT REPETITION"
// CONCEPTS ==> SLIDING WINDOW , HASHMAP , MATH LIBRARY.
public class LongestSubstringWithoutRepetition {
    private static int lswr(String a){
        HashMap<Character,Integer> hm  = new HashMap<>();
        int left = 0;
        int ls = 0;
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(hm.containsKey(ch)){
                left = Math.max(left,hm.get(ch)+1);
            }
            ls = Math.max(left,i-left+1);
            hm.put(ch,i);
        }
        return ls;
    }
    public static void main(String[] args) {
        String a = "dvdf";
        char [] ch = a.toCharArray();
        System.out.println(lswr(a));


    }
}
