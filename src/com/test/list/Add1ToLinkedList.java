package com.test.list;

public class Add1ToLinkedList {
    public static void main(String[] args) {
        int[] a = {1,3,2,9};
        Node n = null;
        for(int k : a){
            n = createNode(k,n);
        }
        Node n1 = add(n);
        while(n1 != null){
            System.out.print(n1.data+" -> ");
            n1 = n1.next;
        }

    }

    private static Node add(Node n){
        Node current = n;
        Node f9 = null;
        while(current != null && current.data != 9){
            f9 = current;
            current = current.next;
        }

        if(f9 == null){
            Node n2 = new Node(1);
            n2.next = n;
            n = n2;
        }else if(current == null){
            Node n3 = n;
            while(n3 != null){
                n3.data = n3.data+1;
                n3=n3.next;
            }
            return n;
        }else{
            f9.data++;
        }
        if(f9 != null){
            current = f9.next;
        }else{
            current = n;
        }
        while(current != null){
            current.data = 0;
            current = current.next;
        }
        return n;
    }

    private static Node createNode(int data,Node n){
        Node n1 = new Node(data);
        if(n == null){
            n = n1;
            return n;
        }
        n.next = createNode(data,n.next);
        return n;
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    public Node(){

    }
}