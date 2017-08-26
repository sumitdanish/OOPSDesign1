package com.test.mattrix;

/**
 * Created by summit on 3/11/17.
 */
public class Rotate90 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int row = 3;
        int col = 4;
        new Rotate90().rorate(mat,row,col);
    }
    public void rorate(int[][] mat,int row,int col){
        int[][] x = new int[col][row];
        for(int i = 0; i <col; i++){
            for(int j = 0; j < row;j++){
                x[i][j] = mat[row-j-1][i];
            }
        }

        for(int i = 0 ; i <col ; i++){
            for(int j = 0; j < row; j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}
