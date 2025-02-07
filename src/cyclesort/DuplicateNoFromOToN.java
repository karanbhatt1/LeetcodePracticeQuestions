package cyclesort;
/*
Leetcode --> 287;
*/
public class DuplicateNoFromOToN {
    public static void main(String[] args) {
        int[]arr = {0,1,2,2,5,6,3,4};
        int dup = cycleSort(arr);
        System.out.println(dup);
    }
    public static int cycleSort(int[]arr){
        int i=0;
        int len = arr.length;
        while(i<len){
            if(arr[i]==i){
                i++;
            }
            else{
                if (isSame(arr, i, arr[i])){
                    return arr[i];
                }
                swap(arr,i,arr[i]);

            }
        }
        return -1;
    }
    private static boolean isSame(int[]arr,int st,int end){
        return arr[st]==arr[end];
    }
    private static void swap(int[]arr,int first,int sec){
        int temp = arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
