package com.test.mattrix;

/**
 * Created by summit on 3/14/17.
 */
public class MinCost {

    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3},
                        {4, 8, 2},
                        {1, 5, 3} };
        int row = 2;
        int col = 2;
        int cost = new MinCost().minCost1(row,col,mat);
        System.out.println(cost);
    }

    public int minCost(int row,int col,int[][] mat){
        if(row < 0 || col < 0){
            return Integer.MAX_VALUE;
        }
        if(row ==0 && col ==0){
            return mat[row][col];
        }
        return mat[row][col]+min(minCost(row-1,col,mat),minCost(row,col-1,mat),minCost(row-1,col-1,mat));
    }

    public int minCost1(int row,int col,int[][] mat){
        int[][] ta = new int[row+1][col+1];
        ta[0][0] = mat[0][0];
        for(int i = 1; i <=row;i++){
            ta[i][0] = ta[i-1][0] + mat[i][0];
        }
        for(int i = 1; i <=col;i++){
            ta[0][i] = ta[0][i-1] + mat[0][i];
        }
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1; j <= col ; j++){
                ta[i][j] = min(ta[i-1][j],ta[i][j-1],ta[i-1][j-1])+mat[i][j];
            }
        }
        for(int i = 0 ; i <= row ; i++){
            for(int j = 0; j <= col ; j++){
                System.out.print(ta[i][j]+",");
            }
            System.out.println();
        }
        return ta[row][col];
    }

    public int min(int a,int b,int c){
        return c > min1(a,b) ? min1(a,b) : c;
    }
    public int min1(int a,int b){
        return a < b ? a : b;
    }
}
