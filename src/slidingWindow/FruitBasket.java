package slidingWindow;
import java.util.HashMap;
class FruitBasket {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int right = 0;
        int left = 0;

        int len = fruits.length;
        int maxLen = 0;
        while(right<len){
            hm.put(fruits[right],right);
            if(hm.size()>2){
                int rem = left;
                if(right>0){
                    left = Math.max(left,hm.get(fruits[right-1]));
                }
                hm.remove(hm.get(fruits[rem]));
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        int ans = totalFruit(arr);
    }
}