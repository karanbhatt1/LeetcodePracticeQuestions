import java.util.List;
import java.util.*;
// Leetcode 54 spiral matrix.
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int topB =0;
        int bottomB = matrix.length-1;
        int leftB = 0;
        int rightB = matrix[0].length-1;

        while(topB<=bottomB && leftB <= rightB){

            // traversing from left to right
            for(int i=leftB;i<=rightB;i++){
                res.add(matrix[topB][i]);
            }
            topB++;

            // traversing from top to bottom
            for(int j=topB;j<=bottomB;j++){
                res.add(matrix[j][rightB]);
            }
            rightB--;

            // Traversing from right to left
            // ensuring that the row is not repeated.
            // right se left tabhi jaa sakta hu jab top < = bottomb ke.
            if(topB<=bottomB){
                for(int k=rightB;k>=leftB;k--){
                    res.add(matrix[bottomB][k]);
                }
                bottomB--;
            }

            // similarly bottom se up traverse karne pe leftB <= rightB ke
            if(leftB<=rightB){
                for(int l = bottomB;l>=topB;l--){
                    res.add(matrix[l][leftB]);
                }
                leftB++;
            }

        }
        return res;
    }

    public static void main(String[] args) {

    }
}