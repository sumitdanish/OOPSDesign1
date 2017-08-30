package com.test.array;

public class NextGreaterEleemnt {
    public static void main(String[] args) {
        next(new int[]{16, 17, 4, 3, 5, 2});
    }

    private static void next(int[] a){
        int max = -1;
        for(int i = a.length-1;i>=0;i--){
            int temp = a[i];
            a[i] = max;
            if(max < temp){
                max = temp;
            }
        }
        for(int k : a){
            System.out.print(k+",");
        }
    }
}
