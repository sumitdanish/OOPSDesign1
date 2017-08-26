package com.test.mattrix;

/**
 * Created by summit on 3/13/17.
 */
public class Spiral {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        new Spiral().spiral(mat,3,3);
    }

    public void spiral(int[][] mat,int row,int col){
        int i =0;
        int j = 0;
        int x = 0;
        int y = 0;
        while(i < row && j < col){
            //x = i;
            for(x = i;x < col ; x++){
                System.out.print(mat[j][x]+",");
            }
            j++;
            for(y = j ; y < row; y++){
                System.out.print(mat[y][col-1]+",");
            }
            col--;
            for(int k = col-1; k >=i;k--){
                System.out.print(mat[row-1][k]+",");
            }
            row--;
            for(int k = row-1; k >=j;k--){
                System.out.print(mat[k][i]+",");
            }
            i++;
        }
    }
}
