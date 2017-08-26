package com.test.graph;

import com.sun.tools.javac.util.ListBuffer;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("dfs.txt"));
        int size = sc.nextInt();
        Graph1 g1 = new Graph1(size);
        while (sc.hasNext()){
            String[] s = sc.next().toString().trim().split(",");
            g1.addEadge(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
        }
        bfs(g1.getGnList(),2,size);

    }

    private static void bfs(Node1[] g,int src,int size){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        boolean[] b = new boolean[size];
        while (!q.isEmpty()){
            int s = q.poll();
            b[s] = true;
            System.out.println(s);
            Node1 n = g[s];
            while(n != null){
                if(!b[n.getData()]){
                    q.add(n.getData());
                    b[n.getData()] = true;
                }
                n = n.getNext();
            }
        }
    }

}

class Graph1{

    private Node1[] gnList;
    boolean[] isRoot;
    public Graph1(int size){
        gnList = new Node1[size];
        for(int i = 0; i < size; i ++){
            gnList[i] = null;
        }
        isRoot = new boolean[size];
    }

    public void addEadge(int src,int dest){
        if(!isRoot[src]){
            gnList[src] = createList(gnList[src],src);
            isRoot[src] = true;
        }
        gnList[src] = createList(gnList[src],dest);
    }

    public Node1[] getGnList() {
        return gnList;
    }

    private Node1 createList(Node1 gn, int data){
       Node1 n = new Node1(data);
       if(gn == null){
           gn = n;
           return gn;
       }
       gn.setNext(createList(gn.getNext(),data));
       return gn;
   }

}
class Node1{
    private int data;
    private Node1 next;

    public Node1(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node1 getNext() {
        return next;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }
}
