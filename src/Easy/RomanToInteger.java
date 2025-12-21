package Easy;
import java.util.Map;
public class RomanToInteger {
    private static int fun(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1, 'V', 5, 'X', 10,
                'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        return result;
    }
    public int romanToInt(String s) {
        int num =0;
        int length = s.length();
        int i=0;
        while(i<length){
            if(i<length-1 && s.charAt(i)=='I' && s.charAt(i+1)=='V'){
                num = num+4;
                i+=2;
            }
            else if(i<length-1 && s.charAt(i)=='C' && s.charAt(i+1)=='M'){
                num = num+900;
                i+=2;
            }
            else if(i<length-1 && s.charAt(i)=='C' && s.charAt(i+1)=='D'){
                num = num + 400;
                i+=2;
            }
            else if(i<length-1 && s.charAt(i)=='X' && s.charAt(i+1)=='C'){
                num = num+90;
                i+=2;
            }
            else if(i<length-1 && s.charAt(i)=='I' && s.charAt(i+1)=='X'){
                num = num + 9;
                i+=2;
            }
            else if(s.charAt(i)=='I'){
                num++;
                i++;
            }
            else if(s.charAt(i)=='V'){
                num = num+5;
                i++;
            }
            else if(s.charAt(i)=='X'){
                num = num+10;
                i++;
            }
            else if(s.charAt(i)=='L'){
                num = num+50;
                i++;
            }
            else if(s.charAt(i)=='C'){
                num = num+100;
                i++;
            }
            else if(s.charAt(i)=='D'){
                num = num+500;
                i++;
            }
            else if(s.charAt(i)=='M'){
                num = num+1000;
                i++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(fun("MCMXCIV"));
    }
}