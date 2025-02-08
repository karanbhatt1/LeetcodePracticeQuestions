package BinarySearch;
/*=>> 540. Single Element in a Sorted Array.*/
public class SingleElementInSortedArray{
    private static int binarySearch(int [] arr,int st, int end){
        int len = arr.length;
        if(len==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[len-1]!=arr[len-2]){
            return arr[len-1];
        }
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            else if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])){
                st = mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }                                           
    public int singleNonDuplicate(int[] nums) {
        return binarySearch(nums,1,nums.length-1);
        
    }

    public static void main(String[] args) {
        //singleNonDeuplicate()
    }
}