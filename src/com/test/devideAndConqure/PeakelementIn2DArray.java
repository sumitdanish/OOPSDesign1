package com.test.devideAndConqure;

public class PeakelementIn2DArray {
    public static void main(String[] args) {
        int[][] mat = {
                        {10,20,15},
                        {21,30,14},
                        {7,16,32}
                      };

    }

//    public static int peakIn2D(int[][] mat,int i,int j,int mid){
//        int[] a = new int[j];
//        for(int i1 = 0; i1 < j;i1++){
//            a[i1] = mat[i1][mid];
//        }
//        int m = peakIn1D(a,0,a.length);
//        int maxVal = a[m];
//
//    }

    private static int peakIn1D(int[] a,int l,int r){
        int mid = (l+r)/2;
        if((mid == 0 || (mid-1 >0 && a[mid] > a[mid-1])) && (mid == a.length - 1 || mid+1 < a.length && a[mid] > a[mid+1])){
            return mid;
        }
        if(mid > 0 && a[mid] < a[mid-1]){
            return peakIn1D(a,l,mid-1);
        }
        return peakIn1D(a,mid+1,r);
    }
}
