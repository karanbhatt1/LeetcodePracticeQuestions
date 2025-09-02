package Dp;

import java.util.Arrays;

public class MinPathToReachLastRow {
    public static int fun(int[][]grid,int[][]mc,int row, int col,int[][] dp){
        if(row>=grid.length || col >=grid[0].length){
            return (int) 1e9;
        }
        if(row==grid.length-1){
            return grid[row][col];
        }
        if(dp[row][col]!= -1){
            return dp[row][col];
        }
        int minC = Integer.MAX_VALUE;
        for(int i = 0;i<grid[0].length;i++){
            int cost = grid[row][col] + mc[grid[row][col]][i] + fun(grid,mc,row+1,i,dp);
            minC = Math.min(cost,minC);
        }
        return dp[row][col] =  minC;
    }
    public static int minPathCost(int[][] grid, int[][] moveCost) {

        int row_0_len = grid[0].length;
        int rows = grid.length;
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[rows][row_0_len];

        for(int[] d: dp){
            Arrays.fill(d,-1);
        }
        for(int i=0;i<row_0_len;i++){
            min = Math.min(min,fun(grid,moveCost,0,i,dp));
        }
        return min;
    }

    public static void main(String[] args) {

    }
}
