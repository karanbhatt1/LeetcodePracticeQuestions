package cyclesort;
/*

*/
import java.util.ArrayList;

public class MissingNoFrom0ToN{
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4};
        int missing = cycleSort(arr);
        System.out.println(missing);

    }

    public static int cycleSort(int[]arr){
        int i=0;
        int j=0;
        int len = arr.length;
        while(i<len){
            if(arr[i]==i){
                i++;
            } else if (arr[i]>=len) {
                swap(arr,i,arr[i]-1);
                i++;
            }
            else {
                swap(arr,i,arr[i]);
            }
        }

       while(j<len){
            if(arr[j]!=j){
                return j;
            }
            else{
                j++;
            }
        }
        if(j==len){
            return len;
        }
        return 0;
    }
    private static void swap(int[]arr,int first,int sec){
        int temp = arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
/**
 * Alternative,way to do this is to find total sum = n*(n+1)/2;
 * And substract with sum of no.
 **/
}
