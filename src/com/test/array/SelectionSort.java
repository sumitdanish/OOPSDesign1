package com.test.array;

public class SelectionSort {

    public static void main(String[] args) {
        selection(new int[]{64 ,25 ,12 ,22 ,11});
    }

    private static void selection(int[] a){
        int min = 0;
        for(int i = 0 ; i < a.length ; i++){
            min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }

        for(int k : a){
            System.out.print(k+",");
        }
    }
}
