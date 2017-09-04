package com.test.array;

public class InsertionSort {
    public static void main(String[] args) {
        insertionSort(new int[]{64 ,25 ,12 ,22 ,11});
    }

    private static void insertionSort(int[] a){
        int key = 0;
        for(int i = 1; i < a.length ; i++){
            int j = i-1;
            key = a[i];
            while(j>=0 && key < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        for(int i : a){
            System.out.print(i+",");
        }
    }

    /*
    *
    * In insertion sort
    *
    * */
}
