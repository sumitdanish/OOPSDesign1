package com.test.tree;

/**
 * Created by summit on 5/25/17.
 */
public class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private int data;
    private static TreeNode bt = null;
    public TreeNode(){

    }
    public TreeNode(int data){
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public static TreeNode createTree(){
        bt = new TreeNode(1);
        bt.setLeft(new TreeNode(2));
        bt.setRight(new TreeNode(3));
        bt.getLeft().setLeft(new TreeNode(4));
        bt.getLeft().setRight(new TreeNode(5));
        bt.getRight().setLeft(new TreeNode(6));
        bt.getRight().setRight(new TreeNode(7));
        return bt;
    }
}
