package Easy;
import java.util.Arrays;

/**
 * 383 -->leetcode easy ransomnote.
 */
public class RansomNote{
    public boolean canConstruct(String ransomNote, String magazine) {
        int len1 = ransomNote.length()-1;
        int len2 = magazine.length()-1;
        if((len1==0 && len2==0) && (ransomNote.charAt(0)!=magazine.charAt(0))){
            return false;
        }
        int [] count = new int[26];
        Arrays.fill(count,0);
        for(int i=0;i<=len2;i++){
            int indx = magazine.charAt(i)-'a';
            count[indx]++;
        }

        for(int j=0;j<=len1;j++){
            int inx = ransomNote.charAt(j)-'a';
            count[inx]--;
            if(count[inx]<1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        RansomNote s = new RansomNote();
//        System.out.println(s.canConstruct("aa","aab"));
        int a = 10;
        int c = (int) (Math.log10(10)+1);
        System.out.println(c);
    }
}