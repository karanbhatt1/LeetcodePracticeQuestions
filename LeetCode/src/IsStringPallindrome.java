
public class IsStringPallindrome {
    public static boolean isPallindrome(String str){
        int i=0;
        int j = str.length()-1;
        while (i < j) {
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    }
}
