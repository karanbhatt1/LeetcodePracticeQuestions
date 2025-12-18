package gridBased;
///  Matrix Multiplication;
/// No of column in first array should be equal to no of row in second.
public class MatrixMultiplication {
    public static int[][] multiplyMatrix(int[][]mat1 , int[][] mat2){
        int row1  = mat1.length;
        int col1  = mat1[0].length;
        int row2 = mat2.length;
        int col2 = mat2[0].length;

        int[][] res = new int[row1][col2];
        if(col1 != row2){
            System.out.println("Cannot multiply matrices!!\n As no of column in first column is not equal to no of rows in second matrix");
            return new int[0][0];
        }
        for(int i=0;i<row1;i++){
            for(int j= 0;j<col2;j++){
                int ans =0;
                if(i==j){
                    for(int k=0;k<col1;k++) {
                        ans += mat1[i][k] * mat2[k][i]; /// When row is equal to column
                    }
                }
                if(i<j){
                    for(int k=0;k<col1;k++) {
                        ans +=  mat1[i][k] * mat2[k][i+1]; //when row is samller than column
                    }

                }
                if(i>j){
                    for(int k=0;k < col1;k++) {
                        ans += mat1[i][k] * mat2[k][i - 1];// when row is smaller than column;
                    }
                }
                res[i][j]  = ans;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},{4,5,6},{2,3,4}}; // 3*3
        int[][] mat2 = {{1,2},{3,4},{5,6},{5,5},{6,7}}; // 5*2
        int[][] ans = multiplyMatrix(mat1,mat2);

        for(int[] row : ans){
            for(int i: row){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
}
