package com.test.array;

public class CountSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 1, 2, 7, 5, 2};
        int n = 8;
        count(a,n);
    }

    private static void count(int[] a,int n){
        int[] output = new int[n];
        int[] count = new int[n];
        for(int i = 0; i < a.length;i++){
            count[a[i]]++;
        }

        for(int i = 1; i < n ; i++){
            count[i] += count[i-1];
        }

        for(int i = 0;i<a.length;i++){
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }

        for(int k : output){
            System.out.print(k+",");
        }

    }
}
