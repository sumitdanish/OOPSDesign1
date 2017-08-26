package com.test.mattrix.com.string;


//http://www.geeksforgeeks.org/program-print-lower-triangular-upper-triangular-matrix-array/

public class MattrixUpperLowerDiagonal {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};;
        int n = 3;
        int m = 3;
        lowerUpper(mat,n,m);
    }
    private static void lowerUpper(int[][] mat,int n,int m){
        int x = 0;
        int j = m-1;
        for(int i = n-1; i >=0 ; i--){
            x = m-1;
            while(x > j && j >= 0){
               mat[i][x] = 0;
                x--;
            }
            j--;
        }

        for(int i = 0; i <n ; i++){
            for(j = 0 ; j < m ; j++){
                System.out.print(mat[i][j]+",");
            }
            System.out.println();
        }
    }
}
