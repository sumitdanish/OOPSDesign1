package com.test.stack;

import java.util.Stack;

/**
 * Created by summit on 2/25/17.
 */
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(6);
        st.push(1);
        st.push(2);
//        while(!st.isEmpty()){
//            System.out.print(st.peek()+",");
//        }
        System.out.println();
        ReverseStack re = new ReverseStack();
       // System.out.println(st.peek());
        re.reverse(st);
        while(!st.isEmpty()){
            System.out.print(st.pop()+",");
        }
    }

    public void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }int temp = st.pop();
        reverse(st);
        insert(st,temp);
    }

    public void insert(Stack<Integer> st,int data){
        if(st.isEmpty() /* data > st.peek()*/){
           System.out.println(st.isEmpty());
            st.push(data);
            return;
        }else{

            int temp = st.pop();
            insert(st,data);
           // System.out.println(temp);
            st.push(temp);
        }
    }

       // System.out.println("lklk");

}
