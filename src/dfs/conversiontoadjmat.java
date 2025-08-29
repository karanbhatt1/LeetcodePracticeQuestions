package dfs;

import java.util.*;
import java.util.LinkedList;

public class conversiontoadjmat {
    public static int[][] changeToAdjmat(int[][] arr,int n){
        int [][] amat = new int[n][n];
        for(int []f :amat){
            Arrays.fill(f,-1);
        }
        for(int[]flight:arr){
            for(int a=0;a<1;a++){
                amat[flight[a]][flight[a+1]]= flight[a+2];
            }
        }
        return amat;
    }
    public static void main(String[] args) {
        int[][] ar = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};

        int[][] res = changeToAdjmat(ar,4);
        for(int[] r : res){
            for(int a: r){
                System.out.print(a+"\t");
            }
            System.out.println();
        }
        List<List<Integer>> al = new LinkedList<>();



    }
}
