package com.test;


/*
*
* if there are N node n the array then we will start comparing from floor(N/2)
*
* */

public class MinHeap {

    public static void main(String[] args) {
        int[] a = {4,7,1,9,34,5,6};
        MinHeapImpl h = new MinHeapImpl(7);
        for(int i =0;i<7;i++){
            h.insert(a[i]);
        }
        for (int k = 0 ; k<7;k++){
            System.out.println(h.remove());
        }

    }

}

class MinHeapImpl{
    private int size;
    private int[] data;
    int initSize = 0;
    public MinHeapImpl(int size){
        this.size = size;
        this.data = new int[size+1];
        this.data[0] = 0;
    }

    public int left(int i){
        return 2*i;
    }
    public int right(int i){
        return 2*i+1;
    }

    public boolean isLef(int i){
        return 2*i > this.data[0];
    }
    public int parent(int i){
        return i/2;
    }

    public void bubbleUp(int i){
        int p = parent(i);
        if(i == 1 || data[p] < data[i]){
            return;
        }
        int temp = data[p];
        data[p] = data[i];
        data[i] = temp;
        bubbleUp(p);
    }

    public void sinkDown(int i){
        if(isLef(i)){
            return;
        }
        int l = left(i);
        int r = right(i);
        int minIndex = 0;
//        if(r > this.data[0]){
//            minIndex = l;
//        }
//        else {
//
//        }
        minIndex = (data[l] < data[r]) ? l: r;
        if(data[i] < data[minIndex]){
            return;
        }
        int temp = data[minIndex];
        data[minIndex] = data[i];
        data[i] = temp;
        sinkDown(minIndex);
    }

    public void insert(int val){
        ++this.data[0];
        data[this.data[0]] = val;
        bubbleUp(this.data[0]);
    }

    public int remove(){
        int min = data[1];
        int lv = data[this.data[0]--];
        data[1] = lv;
        sinkDown(1);
        return min;
    }
}
