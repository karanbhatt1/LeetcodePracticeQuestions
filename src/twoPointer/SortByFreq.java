package twoPointer;

import java.sql.Array;
import java.util.*;

public class SortByFreq {
    private  static  String fun(String str){
        int len = str.length();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        } // n
        StringBuilder res = new StringBuilder();
        List<Character>[] arr  = new ArrayList[len+1];
        map.values().forEach((i)->{arr[i] = new ArrayList<>();}); // constant
        map.keySet().forEach((ch)-> arr[map.get(ch)].add(ch)); // n
        for(int i=len;i>=0;i--){ // n
            if(arr[i]!=null){
                for(char ch: arr[i]){
                    for(int j=0;j<i;j++){ //
                        res.append(ch);
                    }
                }
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str  = "Karaaan";

        System.out.println(fun(str));


    }

}
