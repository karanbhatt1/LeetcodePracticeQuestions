package medium;
import java.util.Arrays;

class Solution {
    static int [][] visited;
    private static void sZ(int[][] mat,int row,int col){
        for(int j=0;j<mat[0].length;j++){
            if(mat[row][j]!=0){
                mat[row][j]=-1;
            }
        }
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]!=0){
                mat[i][col] = -1;
            }
        }
    }
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    sZ(matrix,i,j);
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String [] args){
        int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(mat);
        for(int []i: mat){
            for(int j :i){
                System.out.print(j+"    ");
            }
            System.out.println();


        }

    }
}