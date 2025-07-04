package BinarySearch;

public class PeakElement {
    public static int  pElement(int[] nums,int len){
        int st = 0;
        int end = nums.length-1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(mid==len || mid==0) {
                return mid;
            }
            if((mid>0 && nums[mid] > nums[mid-1]) && (mid<len && nums[mid]>nums[mid+1])){
                return mid;
            }
            else if(mid>0 && nums[mid]<nums[mid-1]){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1,10};
        System.out.println(pElement(nums,nums.length-1));
    }
}
