package slidingWindow;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class LongestSubarrayWithSumK {
    public static int getKey(Hashtable<Integer, Integer> hm, int value){
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(Objects.equals(e.getValue(),value)){
                return e.getKey();
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,1,1,1,1,4,2,3};
        int k=3;
        int sum = 0;
        int maxLength=0;
        Hashtable<Integer,Integer> ps = new Hashtable<>();
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            int exists = sum -k;
            ps.put(i,sum);
            if(sum==k){
                maxLength = Math.max(maxLength,i+1);
            }
            if(ps.containsValue(exists)){
                maxLength = Math.max(maxLength,i-(getKey(ps,exists)));
            }
        }
        System.out.println(maxLength);
    }
}
