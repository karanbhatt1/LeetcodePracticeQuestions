package Easy;

public class ConsecutiveIndexesWhoseSumIsEqualToTarget {
    private static int [] hasElements(int[]arr,int target){
        int sum = arr[0]+arr[1];
        int left = 0;
        int right = 1;
        int [] res = new int[2];
        if(sum==target){
            res[0] = left;
            res[1] = right;
            return res;
        }
        for(int i=right+1;i<arr.length;i++){
            if(sum==target){
                res[0] =i-2;
                res[1] = i-1;
                return res;
            }
            sum = sum + arr[i] - arr[left++];
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] res = hasElements(new int[]{2,7,6,5,4},11);
        for(int a: res){
            System.out.print(a+" ");
        }

    }
}
