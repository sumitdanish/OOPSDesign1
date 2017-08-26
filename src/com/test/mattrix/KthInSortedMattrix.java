package com.test.mattrix;

/**
 * Created by summit on 3/12/17.
 */
public class KthInSortedMattrix {
    public static void main(String[] args) {
        int[][] mat = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 37, 48},
                {32, 33, 39, 50}};

        int k = 3;
        int row = 4;
        int col = 4;
        int l = new KthInSortedMattrix().kthElement(mat,row,col,3);
        System.out.println(l);
    }

    public int kthElement(int[][] mat,int row,int col,int k){
        int low = mat[0][0];
        int highe = mat[row-1][col-1];
        int count = 0;
        while(low < highe){
            int mid = low + (highe-low)/2;
            int i = row-1;
            int j = 0;
            while(i >= 0 && j < col){
                if(mat[i][j] <= mid){
                    j++;
                    count += (i+1);
                }else{
                    i--;
                }
            }

            System.out.println(count+" : "+low);
            if(count < k){
                low = mid;
            }else{
                highe = mid;
            }
        }
        return low;
    }
}
