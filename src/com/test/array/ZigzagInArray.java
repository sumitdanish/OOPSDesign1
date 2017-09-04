package com.test.array;

public class ZigzagInArray {
    public static void main(String[] args) {
        zigzag(new int[]{4, 3, 7, 8, 6, 2, 1});
    }

    private static void zigzag(int[] a){
        boolean flag = true;
        for(int i = 0; i+1 < a.length ; i++){
            if(flag){
                if(a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
                flag = !flag;
            }else{
                if(a[i] < a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
                flag = !flag;
            }
        }

        for(int k : a){
            System.out.print(k+",");
        }
    }
}
