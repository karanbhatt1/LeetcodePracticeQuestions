package medium;

public class SetMatrixToZero {
    public static void setZero(int [][]mat){
        // 1st row and 1st col are used as a marker

        int len = mat.length;
        for(int i=1;i<len;i++){
            for(int j= 1;j<len;j++){
                if(mat[i][j]==0){
                    mat[i][0] = 0; // first element of that row will be set as zero
                    mat[0][j] = 0; // first element of that column will be set as zero
                }
            }
        }
        for(int i=0;i<len;i++){
            mat[i][0]=0;
        }

    }

    public static void main(String[] args) {
        String s = "karan";
        char a = 'a';
        String sa = a+"";
    }
}
