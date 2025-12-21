package String;
class Ai {
    public int myAtoi(String s) {
        s = s.trim();
        int len = s.length();

        boolean isNegative = false;
        int res = 0;

        if(s.isEmpty()){
            return 0;
        }
        int max = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(i==0 && ch == '-'){
                isNegative = true;
            }else if(i==0 && ch == '+'){
                isNegative = false;
            }else if(Character.isDigit(ch)){
                int ldigit = ch-'0';
                if(res > max/10 || (res == max && ldigit >(isNegative ? 8 : 7))){
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                res = res*10 + ldigit;

            }else{
                break;
            }
        }


        if(isNegative){
            res *= -1;
        }
        return res;


    }
}
public class AToI {
    public static void main(String[] args) {
        Ai s1 = new Ai();
        System.out.println(s1.myAtoi("-042"));
    }
}
