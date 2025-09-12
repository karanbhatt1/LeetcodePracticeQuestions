package SlidingWindow;
///  You are given with a array.
///  We need to find the no of sub-arrays where the maximum element is exactly equal to k
///  # These questions are basically solved using sliding window.
///  ### Standing at position i ask how  many sub-arrays can be formed where the max element is exactly equal to k.
///  But WHAT IS THE PROBLEM ?
///  #PROBLEM HERE IS MAX ELEMENT CAN BE DIFFERENT SO WE NEED TO FIND THE PART WHERE THAT MAX ELEMENT DOES NOT EXIST.
///  # So we need to seperate it.
///  Take 2 pointers. badindx and lastk
///  Then find out how many subarrays exist from the lastk to badindx.
public class CountNoOfSubarraysWithMaxSumExactlyEqualsK {
    public static int fun(int[] arr, int k){
        int r =  0;
        int badindx = -1;
        int lastK = -1;
        int count = 0;
        int cont = Integer.MIN_VALUE;
        while(r<arr.length){
            if(arr[r] > k){
                badindx  = r;
            }
            if(arr[r] == k){
                lastK = r;
            }
            cont = Math.max(0,lastK-badindx);
            if (cont>0){
                count += cont;
            }
            r++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,2,3,2,1};
        System.out.println(fun(arr,2));
    }
}
