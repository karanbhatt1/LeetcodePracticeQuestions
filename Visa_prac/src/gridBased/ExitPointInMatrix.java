package gridBased;
/// # We are given a grid of 0 and 1.
/// if 0 is there a person can move but if 1 comes he will have to take right.
/// So we are supposed to tell what is the exit point of person.
///  Array ==> \[1,0,0,1,0],
///            \[0,1,1,0,1]
///            \[0,1,0,0,0]
///            \[1,0,0,0,0]
/// At index 0,0 there is 1 so he will take right. i.e. \(1,0) --> \(2,0) ---> \(3,0) ha 1 so right
/// i.e. \(3,-1) therefore no exit point.
/// Example 2:
///     \[0,0,0,1,0],
///     \[0,1,1,0,1],
///     \[0,1,0,0,0],
///     \[1,0,0,0,0]
///  \(0,0) --> \(0,1) --> \(0,2) --> \(0,3) 1 ha .
/// Right i.e \(1,3) --> \(2,3) --> \(3,3) exit point is 3,3
/// # Exit Point in a Matrix
public class ExitPointInMatrix {
    public static boolean isOne(int[][] arr, int i,int j){
        return arr[i][j] == 1;
    }
    public static int noExit(int left,int right,int top, int bottom){
        return (left<0 || right<0 || top<0 || bottom<0)? -1: 0;
    }
    public static int[] fun(int[][]arr){
        int n = arr.length; // no of rows;
        int m = arr[0].length; // no of cols;
        int dir = 0; // 0--> east , 1--> south , 2-->west , 3--> north
        int i=0;
        int j = 0;
        while(true){
            dir = (dir+arr[i][j])%4;
            if(arr[i][j] == 1){
                arr[i][j] = 0;
            }
            if(dir == 0){
                j++;
            }else if(dir==1){
                i++;
            }else if (dir==2){
                j--;
            } else if (dir==3) {
                i--;
            }

            if(i<0){
                i++;
                break;
            }else if (j<0){
                j++;
                break;
            }else if(i>=n){
                i--;
                break;
            }else if(j>=m){
                j--;
                break;
            }
        }
        return new int[]{i,j};
    }

    public static void main(String[] args) {

    }
}
