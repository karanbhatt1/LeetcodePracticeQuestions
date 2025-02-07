package BinarySearch;
/**
 * Leet code --> 69 Sqrt(x) without using any builtin function.
 */
public class SqrtOfNo {
    private static int sqareno(int x){
        if(x==0||x==1){
            return x;
        }
        int low = 1;
        int high = x;
        while(low<=high){
            int mid = low +(high-low)/2;
            long midsq = (long) mid*mid;
            if(midsq==x){
                return mid;
            }
            if(midsq>x){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return Math.round(high);
    }
    public static void main(String[] args) {
       int res = sqareno(8);
        System.out.println(res);
    }
}
