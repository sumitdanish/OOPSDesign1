package com.test.mattrix;

/**
 * Created by summit on 3/11/17.
 */
public class InplaceRotation {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int n = 3;
        for(int i = 0; i <n ; i++){
            for(int j = 0; j < n;j++){
                System.out.print(mat[i][j]+",");
            }
            System.out.println();
        }
        new InplaceRotation().inplaceRotate(mat,n);
    }

    public void inplaceRotate(int[][] mat,int n){
        for(int i = 0; i <Math.floor(n);i++){
            for(int j = 0;j<n-i-1;j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[j][n-i-1];
                mat[j][n-i-1] = mat[n-i-1][n-j-1];
                mat[n-i-1][n-j-1] = mat[n-j-1][i];
                mat[n - j -1][i] = tmp;
            }
        }

        System.out.println("**************\n");

        for(int i = 0; i <n ; i++){
            for(int j = 0; j < n;j++){
                System.out.print(mat[i][j]+",");
            }
            System.out.println();
        }
    }

}
