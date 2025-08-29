package SqrtDecomposition;
import java.util.*;
public class RangeSumQuery {
    public static void main(String[] args){
        int[] arr = {1,3,5,2,7,6,1,4,8,9};
        int block_elem = (int) Math.sqrt(arr.length);
        int block_id = -1;
        int [] block = new int[block_elem+1];
        for(int i=0;i<arr.length;i++){
            if(i%block_elem==0){
                block_id++;
            }
            block[block_id] +=arr[i];
        }
    }
}
