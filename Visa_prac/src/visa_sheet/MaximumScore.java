package visa_sheet;
/// Score starts with 0 intially.
/// We can perform at most k operation and take the point in score.
/// operation is --> take the point and covert the arr\[indx] = Math.ceil/(arr\[indx]/3\)


///  # DP problem for which we will write the reucurrance relation first.
/// Then memoize if there are overlapping subproblems.
public class MaximumScore {
    public static int  maxScore(int[]points,int indx,int k, int op,int maxScore){
        int score = 0;
        if(points.length == 0){
            return 0;
        }
        if(points.length == 1 && k==0){
            return 0;
        }
        if(points.length == 1 && k==1){
            return points[0];
        }
        if(op ==k-1){
            score += points[indx];
            return Math.max(maxScore,score);
        }
        if(indx == points.length-1) {
            return points[indx];
        }

        for(int i=0;i<points.length;i++){
            int ele  = points[i];
            //points[indx] = (int) Math.ceil((double) ele /3);
            score = ele + maxScore(points,indx+1,k,op+1,maxScore);
            maxScore = Math.max(score,maxScore);
        }
        return maxScore;
    }

    public static int maxEle(int[]arr){
        int maxIndx = 0;
        int maxEle = arr[0];
        if(arr.length ==1){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(maxEle< arr[i]){
                maxEle = arr[i];
                maxIndx = i;
            }
        }
        return maxIndx;
    }
    public static  int mScore(int[]nums,int k){
       int score = 0;
       int maxSc = Integer.MIN_VALUE;
        while(k!=0){
           int maxIndx = maxEle(nums);
           score += nums[maxIndx];
           nums[maxIndx] = (int) Math.ceil((double)nums[maxIndx]/3);
           maxSc = Math.max(maxSc,score);
           k--;
       }
        return maxSc;
    }
    public static void main(String[] args) {
        int [] arr = {1, 1, 1};
        int k = 4;
        System.out.println(mScore(arr,k));
    }
}
