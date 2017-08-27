package com.test.array;

public class SmallestPositiveInSubset {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 10, 11, 15};
        System.out.println(smallesr(a));
    }

    private static int smallesr(int[] a){
        int res = 1;
        for(int i = 0; i <a.length && a[i] <= res ; i++){
            res+=a[i];
        }
        return res;
    }
}
