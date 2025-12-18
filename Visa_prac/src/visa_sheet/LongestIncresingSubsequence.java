package visa_sheet;
import java.util.*;
public class LongestIncresingSubsequence {
    public static int lIS(int[]arr,int indx, int prevIndx){
        if(indx==arr.length){
            return 0;
        }

        int skip = lIS(arr,indx+1,prevIndx);
        int count = 0;
        if(prevIndx != -1 || arr[indx] > arr[prevIndx]){
            count = 1 + lIS(arr,indx+1,indx);
        }

        return Math.max(count,skip);
    }
}
