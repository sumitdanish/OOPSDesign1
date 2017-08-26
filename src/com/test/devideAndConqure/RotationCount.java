package com.test.devideAndConqure;

public class RotationCount {

    public static void main(String[] args) {
        int[] a = {7,9,11,12,5};
        System.out.println(count(a,0,a.length-1));
    }

    public static int count(int[] a,int left,int right){
        int mid = (left+right)/2;
        if(mid -1 > 0 && a[mid-1] > a[mid]){
            return mid;
        }
        if(mid+1 < a.length && a[mid] > a[mid+1]){
            return mid;
        }
        if(mid-1 > 0 && a[mid] < a[right]){
            return count(a,left,mid-1);
        }else if(mid+1 < right) {
            return count(a, mid + 1, right);
        }
        return -1;
    }
}
