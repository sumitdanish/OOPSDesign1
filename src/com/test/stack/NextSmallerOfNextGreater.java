package com.test.stack;

import java.util.Stack;

/**
 * Created by summit on 2/26/17.
 */
public class NextSmallerOfNextGreater {
    public static void main(String[] args) {
        int[] a = {5, 1, 9, 2, 5, 1, 7};
        new NextSmallerOfNextGreater().nextSmaller(a);
    }

    public void smaller(int[] a,char ch,int[] NG){
        Stack<Integer> st = new Stack<>();
        int nex = 0;
        int x = 0;
       // st.push(0);
        for(int i = a.length - 1 ;i >= 0 ; i--){
            while(!st.isEmpty() && (ch == 'G' ? a[st.peek()] <= a[i] : a[st.peek()] >= a[i])){
                st.pop();
            }
            if(!st.isEmpty()){
                NG[i] = st.pop();
            }else{
                NG[i] = -1;
            }
            st.push(i);
        }

    }

    public void nextSmaller(int[] a){
        //int
        int[] NG = new int[a.length];
        int[] NS = new int[a.length];
        smaller(a,'G',NG);
        smaller(a,'S',NS);
        for(int i =0;i < a.length ; i++){
            if(NG[i] != - 1 && NS[NG[i]] != -1){
                System.out.println(a[NS[NG[i]]]);
            }else{
                System.out.println("-1");
            }
        }
    }
}
