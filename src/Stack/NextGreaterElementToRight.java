package Stack;

import java.util.Arrays;

class Stack{
    int[] arr;
    int top;
    Stack(int top,int n){
        this.top = top;
        this.arr = new int[n];
    }

    public boolean isEmpty(){
        return this.top == -1;
    }
    public boolean push(int ele){
        if(this.isEmpty()){
            top++;
            arr[top] = ele;
            return true;
        }
        top++;
        arr[top] = ele;
        return true;
    }
    public int peek(){
        if(this.isEmpty()){
            return -1;
        }
        return arr[top];
    }
    public int pop(){
        if(this.isEmpty()){
            return -1;
        }
        int ele = arr[top];
        arr[top] = 0;
        top--;
        return ele;
    }
}
public class NextGreaterElementToRight {
    public static void main(String[] args) {
        int [] arr = {10,2,6,9,8,1,4};

        int len = arr.length;
        Stack st = new Stack(-1,len);

        int [] ans = new int[len];
        ans[len-1]  = -1;

        st.push(arr[len-1]);

        for(int i=len-2;i>=0;i--){

            int top = st.peek();
            while(!st.isEmpty() && top <= arr[i]){
                st.pop();
            }
            ans[i] = top;
            if(st.isEmpty()){
                ans[i] = -1;
            }
            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}
