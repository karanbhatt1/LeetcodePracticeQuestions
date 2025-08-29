package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    static int minActivity(int[][] interval,int currEnd, int indx ){
        if(indx == interval.length){
            return 0;
        }
        int take = 1;
        if(interval[indx][0] >= currEnd){
            take = 1 + minActivity(interval,interval[indx][1],indx+1);
        }
        int skip = minActivity(interval,currEnd,indx+1);
        return Math.max(take,skip);
    }
    public static  int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals , new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[1] - b[1];
            }
        });
        return minActivity(intervals,0,0);
    }

    public static void main(String[] args) {
        int [][] arr = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(arr));

    }
}
