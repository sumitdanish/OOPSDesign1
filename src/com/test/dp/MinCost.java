package com.test.dp;

public class MinCost {

    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };
        int row = 2;
        int col = 2;
        minCost(mat,row,col);

        /*
        *   1,3,6,
            5,9,5,
            6,10,8,
        *
        *
        * */
    }

    private static void minCost(int[][] mat,int row,int col){
        int[][] cost = new int[row+1][col+1];
        cost[0][0] = mat[0][0];
        for(int i = 1 ; i <= row; i++){
            cost[i][0] = cost[i-1][0]+mat[i][0];
        }
        for(int j=1;j<=col;j++){
            cost[0][j] = cost[0][j-1]+mat[0][j];
        }

        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=col;j++){
                cost[i][j] = mat[i][j]+min(min(cost[i-1][j],cost[i][j-1]),cost[i-1][j-1]);
            }
        }
        /*for(int i = 0;i<=row;i++){
            for(int j = 0; j <= col;j++){
                System.out.print(cost[i][j]+",");
            }
            System.out.println();
        }*/

        int r = row;
        int c = col;
        while(r>=0 && col >= 0){
            if(cost[r][c] < cost[r][c-1]){
                System.out.println("("+r+","+c+")");
                r--;
            }else if(r-1>=0 && c-1>=0 && cost[r][c] < cost[r-1][c] && cost[r][c] < cost[r][c-1]){
                System.out.println("("+r+","+c+")");
                r--;c--;
            }else if(r-1>=0 && c-1>=0 && cost[r][c] > cost[r-1][c-1]){
                System.out.println("("+r+","+c+")");
                c--;
            }
        }
    }

    private static int min(int a,int b){
        return a > b ? b : a;
    }
}
