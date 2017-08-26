package com.test.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by summit on 5/25/17.
 */
public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        ImplementStackUsingQueue imp = new ImplementStackUsingQueue();
        imp.push(q1,q2,1);
        imp.push(q1,q2,3);
        imp.push(q1,q2,4);
        System.out.println(imp.pop(q1));
    }
    public void push(Queue<Integer> q1,Queue<Integer> q2,int data){
        if(q1.isEmpty()){
            q1.add(data);
        }else{
            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
        }
    }
    public int pop(Queue<Integer> q1){
        return q1.poll();
    }
}
