package String;
import java.util.*;
public class Count_Substring {
    public static int countSubstring(String s) {
        // code here
        int len = s.length();

        Map<Character, Integer> mp = new HashMap<>();

        int count = 0;
        int i = 0;
        int j = 0;
        while (j < len) {
            char ch = s.charAt(j);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            if (mp.size() == 3) {
                count += (len - i) - (j - i);
                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) - 1);
                if (mp.getOrDefault(s.charAt(i), 0) == 0) {
                    mp.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstring("abcabc"));
    }
}
