package com.test.mattrix;

/**
 * Created by summit on 3/13/17.
 */
public class BooleanMa {
    public static void main(String[] args) {
        int[][] mat = { {1, 0, 0, 1},
                        {0, 0, 1, 0},
                        {0, 0, 0, 0},
        };
        int row = 3;
        int col = 4;
        new BooleanMa().booleanMat(mat,row,col);
    }

    public void booleanMat(int[][] mat,int row,int col){
        for(int i = 0 ; i <row;i++){
            for(int j = 0; j < col; j ++){
                if(mat[i][j] == 1){
                    mat[0][j] = 1;
                    mat[i][0] = 1;
                }
            }
        }

        for(int i = 0 ; i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(mat[i][j]+",");
            }
            System.out.println();
        }
        System.out.println("*************");
        for(int i = 1 ; i<row;i++){
            for(int j =1;j<col;j++){
                if(mat[i][0] == 1 || mat[0][j] == 1){
                    mat[i][j] =1;
                }
            }
        }

        for(int i = 0 ; i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(mat[i][j]+",");
            }
            System.out.println();
        }


    }
}
