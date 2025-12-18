package string_Based;

// given a string  "aabablcs"  we need to determine the longest palindromic substring.
// Approach : we can start from middle of the array.


///  Take 2 pointer i at n/2-1 and j == n/2+1
///  if(s.charAt(i)== s.charAt(j)) then i-- and j++
/// Odd length and Even length : if the String is of odd length i.e. "aabablc" A partition of equal length can be done.
/// In case of even we can't make the equal length partition and mid is between 2 elements so we take \[i] and \[i+1] as the st and ending points.
///
public class LongestPalindromicSubstring {
    public static  String longPalSubstr(String str,int st, int end){
        int i = st;
        int j = end;
        int len = str.length();
        while(i>=0 && j<len && str.charAt(i) == str.charAt(j)){
            i--;
            j++;
        }
        return str.substring(i+1,j);
    }

    public static void main(String[] args) {
        // edge cases:
        String str = "aabablas";
        int len = str.length();
        if(str.length()== 1){
            System.out.println(str);
        }
        if(str == null){
            System.out.println(" ");
        }
        String longest = "";
        for(int i=0;i<len;i++){
            String odd = longPalSubstr(str,i,i);
            String even = longPalSubstr(str,i,i+1);

            if(odd.length()>longest.length()){
                longest = odd;
            }
            if(even.length()>longest.length()){
                longest = even;
            }
        }
    }
}
