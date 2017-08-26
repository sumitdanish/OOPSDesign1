package com.test.mattrix;

public class RoboMovement {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        move(row,col);
    }

    private static void move(int row,int col){
        int[][] move = new int[row][col];
        for(int i =0;i<row;i++){
            move[i][0] = 1;
        }
        for(int j = 0;j<col;j++){
            move[0][j] = 1;
        }
        boolean[][] isVisisted = new boolean[row][col];
        for(int i = 1; i < row;i++){
            for(int j = 1; j < col ; j++){
                    int[] x = {0,0,-1,1};
                    int[] y = {1,-1,0,0};
                    int v = 0;
                    for(int k = 0;k<4;k++){
                        int r1 = i+x[k];
                        int c1 = j+y[k];
                        if(r1>=0 && c1 >=0 && r1 < row&&c1 < col) {
                            v += move[r1][c1];
                        }
                    }
                    move[i][j] = v;
            }
        }
        System.out.println(move[row-1][col-1]);
    }
}
