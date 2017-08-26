package com.test.graph;


import javax.xml.soap.Node;
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.*;

public class DFS {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("dfs.txt"));
        int size = sc.nextInt();
        Graph2 g = new Graph2(size);
        while(sc.hasNext()){
            String[] s = sc.next().toString().trim().split(",");
            g.addEadge(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
        }
        g.dfs1(2);
    }
}


class Graph2{
    private Node2[] gnode;
    Map<Integer,Node2> gmap = new HashMap<>();
    private int size;
    Set<Integer> isRoot = new HashSet<>();
    Set<Integer> isVisited = new HashSet<>();
    Stack<Integer> st = new Stack<>();
    public Graph2(int size){
        this.size = size;
        gnode = new Node2[size];
    }

    public void addEadge(int src,int dest){
        Node2 n1 = null;
        if(!isRoot.contains(src)){
            n1 = createNode(n1,src);
            gmap.put(src,n1);
//            gnode[src] = createNode(gnode[src],src);
            isRoot.add(src);
        }
        n1 = gmap.get(src);
        n1 = createNode(n1,dest);
        gmap.put(src,n1);
       // gnode[src] = createNode(gnode[src],dest);
    }

    public void dfs(int v){
        isVisited.add(v);
        System.out.print(v+",");
        Node2 n = gmap.get(v);
        while(n != null){
            if(!isVisited.contains(n.getData())){
                dfs(n.getData());
            }
            n = n.getNext();
        }
    }

    public void dfs1(int v){
        st.push(v);
        isVisited.add(v);
        while(!st.isEmpty()){
            int src = st.pop();
            System.out.print(src+",");
            Node2 n = gmap.get(src);
            while(n != null){
                if(!isVisited.contains(n.getData())){
                    st.push(n.getData());
                    isVisited.add(n.getData());
                }
                n = n.getNext();
            }
        }
    }

    public Node2[] getGnode() {
        return gnode;
    }

    public void setGnode(Node2[] gnode) {
        this.gnode = gnode;
    }

    public Node2 createNode(Node2 node, int data){
        Node2 n = new Node2(data);
        if(node == null){
            node = n;
            return node;
        }
        node.setNext(createNode(node.getNext(),data));
        return node;
    }
}

class Node2{
    private int data;
    private Node2 next;
    public Node2(){

    }
    public Node2(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

}