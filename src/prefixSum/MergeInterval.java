package prefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][]list = {{1,3},{10,6},{8,10},{15,18}};
        Arrays.sort(list,(a,b)->{
            int st_time = a[0];
            int st2 = b[0];
            return st_time-st2;
        });
        int len = list.length;
        List<int[]> mer_inter = new ArrayList<>();
        int iS = list[0][0];
        int iE = list[0][1];
        for(int i= 1;i<len;i++){
            int st = list[i][0];
            int end = list[i][1];
            if(iE >= st){
                iE = Math.max(iE,end);
            }else{
                mer_inter.add(new int[]{iS,iE});
                iS = st;
                iE = end;
            }
        }
        mer_inter.add(new int[]{iS,iE});
        int row = mer_inter.size();
        int[][] ans = new int[row][2];

        for(int i=0;i<row;i++){
            ans[i][0] = mer_inter.get(i)[0];
            ans[i][1] = mer_inter.get(i)[1];
        }
        for(int [] i: ans){
            System.out.print("[");
            for(int j:i){
                System.out.print(" "+ j + " ");
            }
            System.out.print("]");
        }
    }
}
