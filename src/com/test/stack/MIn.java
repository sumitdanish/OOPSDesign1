package com.test.stack;

import java.util.Stack;

/**
 * Created by summit on 4/26/17.
 */
public class MIn {
    public static void main(String[] args) {
        int[] a = {1, 6, 4, 10, 2, 5};
        new MIn().min(a);
    }

    public void min(int[] a){
        Stack<Integer> st = new Stack<>();
        int x = 0;
        for(int i = 0; i < a.length ; i++){
            while(!st.isEmpty() && st.peek() >= a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.println("-1");
            }else{
                System.out.println(st.peek());
            }
            st.push(a[i]);
        }
    }
}
