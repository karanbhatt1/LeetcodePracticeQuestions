package slidingWindow;
import java.util.*;
class countOfSub {
    public static int nextConsIndx(String word, int st){
        int len = word.length();

        for(int i = st+1 ;i<len;i++){
            char ch = word.charAt(i);
            if(ch != 'a' && ch!= 'e' && ch!='i' && ch!='o' && ch!='u'){
                return i;
            }
        }
        return -1;
    }
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static long countOfSubstrings(String word, int k) {
        int len = word.length();

        int right = 0;
        int left = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        long ans = 0;

        int consCount = 0;
        while (right < len) {
            char c = word.charAt(right);
            if (isVowel(c)) {
                hm.put(c, hm.getOrDefault(c, 0) + 1);

            } else {
                consCount++;
            }
            while (hm.size() == 5 && consCount == k && left < len) {
                int nextConsIndx = nextConsIndx(word, right);
                ans = (nextConsIndx - right) + ans;
                if (isVowel(word.charAt(left))) {
                    hm.put(word.charAt(left), hm.getOrDefault(word.charAt(left), 0) - 1);
                    if (hm.get(word.charAt(left)) == 0) {
                        hm.remove(word.charAt(left));
                    }
                    left++;
                } else {
                    consCount--;
                    left++;
                }
            }
            right++;

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countOfSubstrings("ieaouqqieaouqq",1));
    }
}