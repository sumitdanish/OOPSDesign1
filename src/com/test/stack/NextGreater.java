package com.test.stack;

import java.util.Stack;

/**
 * Created by summit on 2/26/17.
 */
public class NextGreater {
    public static void main(String[] args) {
        int[] a = {5, 1, 9, 2, 5, 1, 7};
        new NextGreater().nextGreate(a);
    }

    public void nextGreate(int[] a){
        Stack<Integer> st = new Stack<>();
        st.push(a[0]);
        int next = 0;
        for(int i =1; i <a.length; i++){
            if(!st.isEmpty()){
                next = a[i];
                int ele = st.pop();
                while(ele < next){
                    System.out.println(ele+" : "+next);
                    if(st.isEmpty()){
                        break;
                    }
                    ele = st.pop();
                }
                if(ele > next){
                    st.push(ele);
                }
            }
            st.push(next);
        }

        while(!st.isEmpty()){
            System.out.println(st.pop()+" : "+"-1");
        }
    }

}
