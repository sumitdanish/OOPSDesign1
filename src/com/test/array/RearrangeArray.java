package com.test.array;


/*
* http://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/
* */
public class RearrangeArray {
    public static void main(String[] args) {
        int[] a = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        rearrange(a);
        for(int k : a){
            System.out.print(k+",");
        }
    }

    /*
    * Rearranging array using insertion sort
    * */
    private static void rearrange(int[] a){
        for(int i = 1; i < a.length ; i++){
            int key = a[i];
            if(key > 0){
                continue;
            }
            int j = i-1;
            while(j >= 0 && a[j] > 0){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=key;
        }
    }


}
