package Dp;
import java.util.Arrays;
class MinimumFallingPath {
    public static int fallingPath(int[][] nums, int row, int col){
        if (col < 0 || col >= nums[0].length) {
            return (int)1e9; // important as taking Integer.MAX_VALUE would overflow the memory.
        }
        if (row == nums.length - 1) {
            return nums[row][col];
        }
        
        int down = nums[row][col] + fallingPath(nums, row+1, col);
        int left = nums[row][col] + fallingPath(nums, row+1, col-1);
        int right = nums[row][col] + fallingPath(nums, row+1, col+1);

        return Math.min(down, Math.min(left, right));
    }

    public static int minFallingPathSum(int[][] matrix) {
        int ncol = matrix[0].length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < ncol; i++) {
            min = Math.min(min, fallingPath(matrix, 0, i));
        }
        return min;
    }

    ///  Dp solution --> Memoization
    /// Recurssion Top Down
    /// Tabulatiion is Bottom up
    public static int minFall_Dp(int[][]matrix,int[][]dp,int row, int col){
        if(col<0 || col>=matrix.length){
            return (int)1e9;
        }
        if(row==matrix.length-1){
            return matrix[row][col];
        }
        if(dp[row][col] != (int)1e9){
            return dp[row][col];
        }
        int bl = matrix[row][col] + minFall_Dp(matrix,dp,row+1,col);
        int ld = matrix[row][col] + minFall_Dp(matrix,dp,row+1,col-1);
        int rd = matrix[row][col] + minFall_Dp(matrix,dp,row+1,col+1);

        return dp[row][col] = Math.min(bl,(Math.min(ld,rd)));
    }
    public static int minFallPathSum_Dp(int[][]matrix,int[][]dp){
        int ncol = matrix.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<ncol;i++){
            min = Math.min(min, fallingPath(matrix,0,i));
        }
        return min;
    }
    public static void main(String[] args) {
        // using dp;

        ///  How to find the size of dp array:
        ///  Take the changing parameters from the recurrance relation.
        int [][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int len  = matrix.length;
        int ncols = matrix[0].length;

        int[][] dp = new int[len][ncols];
        for(int[]row : dp){
            Arrays.fill(row,(int)1e9);
        }
    }
}
