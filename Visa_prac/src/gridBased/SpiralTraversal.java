package gridBased;
import java.util.*;
public class SpiralTraversal {
    public static void spiralTraverse(int[][]matrix){
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(left<=right && top <= bottom){
            for(int i= left;i<=right;i++){
                System.out.print(matrix[top][i]+ " ");
            }
            top++;
            System.out.println();
            for(int i = top ;i<=bottom;i++){
                System.out.print(matrix[i][right]+ " ");
            }
            right--;
            System.out.println();
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            System.out.println();
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }

    }
    ///  Set the boundaries
    /// s_row, e_row, s_col, e_col;
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}
                       ,{4,5,6}
                       ,{7,8,9}};

        spiralTraverse(arr);
    }
}
