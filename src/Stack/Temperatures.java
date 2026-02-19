//package Stack;
//
//public class Temperatures {
//    public static int[] dailyTemperatures(int[] temperatures) {
//        // Monotonic Stack.
//        /**
//         -> which one ?
//         */
//
////        int len = temperatures.length;
////        int[] ans = new int[len];
//////        Stack st = new Stack<>();
////
////        for(int i=len-1;i>=0;i--){
////            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
////                st.pop();
////            }
////
////            if(!st.isEmpty() && temperatures[st.peek()] > temperatures[i]){
////                ans[i] =  Math.abs(i - st.peek());
////            }else{
////                ans[i] = 0;
////            }
////            st.push(i);
////
////        }
////        return ans;
////    }
//
//    public static void main(String[] args) {
//
//    }
//}
