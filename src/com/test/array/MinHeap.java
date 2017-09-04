package com.test.array;

public class MinHeap {
    public static void main(String[] args) {
        int[] a = {4,7,1,9,34,5,6};
        MinHeapImpl min = new MinHeapImpl(a.length);
        for(int i : a){
            min.insert(i);
        }
        System.out.println(min.remove());
       for(int i = 0; i < a.length ; i++){

       }
    }
}

class MinHeapImpl{
    private int[] data;
    private int size = 0;
    public MinHeapImpl(int size){
        this.data = new int[size+1];

        this.data[0] = 0;
    }

    private int left(int i){
        return 2*i;
    }
    private int right(int i){
        return 2*i+1;
    }
    private int parent(int i){
        return i/2;
    }
    private boolean isLef(int i){
        return 2*i > this.data[0];
    }

    private void bubbleUp(int i){
        int p = parent(i);
        if(i == 1 || this.data[p] < this.data[i]){
            return;
        }
        int temp = this.data[i];
        this.data[i] = this.data[p];
        this.data[p] = temp;
        bubbleUp(p);
    }

    private void sinkDown(int i){
        if(isLef(i)){
            return;
        }
        int l = left(i);
        int r = right(i);
        int min = (this.data[l] < this.data[r] ? l : r);
        if(this.data[i] < this.data[min]){
            return;
        }
        int temp = this.data[min];
        this.data[min] = this.data[i];
        this.data[i] = temp;
        sinkDown(min);
    }

    public void insert(int v){
        ++this.data[0];
        this.data[this.data[0]] = v;
        bubbleUp(this.data[0]);
    }

    public int remove(){
        System.out.println(this.data[0]);
        int min = this.data[1];
        int i = this.data[this.data[0]--];
        this.data[1] = i;
        sinkDown(1);
        return min;
    }
}
