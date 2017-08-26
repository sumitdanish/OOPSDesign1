package com.test.graph;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class TopologicalSorting {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("topo.txt"));
        Graph3 g = new Graph3();
        String line = "";
        while(!(line=sc.next().toString().trim()).equals("#")){
            String[] s = line.split(",");
            g.addEadge(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
        }
        Node3 n = g.getGmap().get(5);
        System.out.println(g.getIndegree().get(1));
        while(n != null){
            System.out.print(n.getData()+",");
            n =n.getNext();
        }
    }
}

class Graph3{
    private Map<Integer,Node3> gmap = new HashMap<>();
    private Set<Integer> isRoot = new HashSet<>();
    private Set<Integer> isVisited = new HashSet<>();
    private Stack<Integer> order = new Stack<>();
    private Map<Integer,Integer> indegree = new HashMap<>();
    public void addEadge(int src,int dest){
        Node3 n1 = null;
        int ind = 1;
        if(!isRoot.contains(src)){
            n1 = createNode(n1,src);
            gmap.put(src,n1);
            isRoot.add(src);
        }
        if(indegree.containsKey(dest)){
            ind += indegree.get(dest);
        }
        indegree.put(dest,ind);
        n1 = gmap.get(src);
        n1 = createNode(n1,dest);
        gmap.put(src,n1);
    }

    public void topological(int v){
        isVisited.add(v);

    }

    public Node3 createNode(Node3 node,int data){
        Node3 n = new Node3(data);
        if(node == null){
            node = n;
            return node;
        }
        node.setNext(createNode(node.getNext(),data));
        return node;
    }

    public Map<Integer, Node3> getGmap() {
        return gmap;
    }

    public Map<Integer, Integer> getIndegree() {
        return indegree;
    }
}

class Node3{
    private int data;
    private Node3 next;
    public Node3(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node3 getNext() {
        return next;
    }

    public void setNext(Node3 next) {
        this.next = next;
    }
}
