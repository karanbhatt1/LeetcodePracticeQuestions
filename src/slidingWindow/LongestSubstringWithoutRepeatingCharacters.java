package slidingWindow;

import java.util.HashSet;
import java.util.Set;

/**
 * In this we need to find unique elements so we can use datastructure which does not store duplicates like set
 * ==> or we can either count the occourences using the hash map.
 * Sliding Window.
 */

/**
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int longsubstring(String s) {
        int len = s.length();
        int right = 0;
        int left = 0;
        int maxlen = Integer.MIN_VALUE;
        Set<Character> charset = new HashSet<>();
        while (right < len) {
            char ch = s.charAt(right);
            if (!charset.contains(ch)) {        //abcadebaacaacabac
                charset.add(ch);
                maxlen = Math.max(maxlen, right - left+1);
            } else {
                while (charset.contains(ch)) {
                    charset.remove(s.charAt(left));
                    left++;
                }
                charset.add(ch);
            }
            right++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        System.out.println(longsubstring("abcadebaacaacabac"));
    }
}
