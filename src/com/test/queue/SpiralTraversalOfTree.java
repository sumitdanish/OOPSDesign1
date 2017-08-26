package com.test.queue;

import com.test.tree.TreeNode;

import java.util.Stack;

/**
 * Created by summit on 5/25/17.
 */
public class SpiralTraversalOfTree {

    public static void main(String[] args) {
        TreeNode tree  = TreeNode.createTree();
        new SpiralTraversalOfTree().levelOrder(tree);
    }

    public void levelOrder(TreeNode tree){
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(tree);
        while(!st1.isEmpty() || !st2.isEmpty()){
            while(!st1.isEmpty()){
                TreeNode temp = st1.pop();
                System.out.print(temp.getData()+",");
                if(temp.getLeft() != null){
                    st2.push(temp.getLeft());
                }
                if(temp.getRight() != null){
                    st2.push(temp.getRight());
                }
            }
            System.out.println();
            while(!st2.isEmpty()){
                TreeNode temp = st2.pop();
                System.out.print(temp.getData()+",");
                if(temp.getRight() != null){
                    st1.push(temp.getRight());
                }
                if(temp.getLeft() != null){
                    st1.push(temp.getLeft());
                }
            }
            System.out.println();
        }
    }
}
