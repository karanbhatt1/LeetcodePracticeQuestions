package slidingWindow;
import java.util.*;

public class CountOccurenceOfAnagram {
    public static int search(String pat, String txt) {
        // code here
        int patlen = pat.length();
        int txtlen = txt.length();
        if(patlen>txtlen){
            return 0;
        }
        int count = 0;

        int right = 0;
        int left = 0;
        int match = 0;

        HashMap<Character,Integer> fre = new HashMap<>();

        // populating the hash map
        for(int i=0;i<patlen;i++){
            fre.put(pat.charAt(i),fre.getOrDefault(pat.charAt(i),0)+1);
        }
        // now comparing with txt;

        while(right<txtlen){
            char ch = txt.charAt(right);

            if(fre.containsKey(ch)){
                fre.put(ch,fre.getOrDefault(ch,0)-1);
                if(fre.getOrDefault(ch,0)==0){
                    match++;
                }
            }

            if(right-left+1 == patlen){
                if(match == fre.size()){
                    count++;
                }
                if(fre.containsKey(txt.charAt(left))){
                    if(fre.get(txt.charAt(left))==0){
                        match--;
                    }
                    fre.put(txt.charAt(left),fre.getOrDefault(txt.charAt(left),0)+1);
                }
                left++;
            }
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
       // System.out.println(search("tty","git git "));
        String s = "karan";
        s.substring(0,3);
        System.out.println(s.contains("kar"));

    }
}
