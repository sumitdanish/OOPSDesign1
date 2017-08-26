package com.test.stack;

import java.util.Stack;

/**
 * Created by summit on 2/26/17.
 */
public class MinInO1 {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public static void main(String[] args) {
        MinInO1 m = new MinInO1();
        m.minPush(1);
        m.minPush(10);
        m.minPush(20);
        m.minPush(5);
        System.out.println(m.getMin());
        m.minPush(-1);
        System.out.println(m.getMin());
    }

    public void minPush(int data){
        if(st1.isEmpty() && st2.isEmpty()){
            st1.push(data);
            st2.push(data);
            return;
        }
        int y = st2.peek();
        st1.push(data);
        if(y < data){
            st2.push(y);
        }else if(y > data){
            st2.pop();
            st2.push(data);
        }
    }

    public int getMin(){
        return st2.pop();
    }
}
