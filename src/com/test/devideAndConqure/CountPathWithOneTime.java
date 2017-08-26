package com.test.devideAndConqure;

public class CountPathWithOneTime {

    public static void main(String[] args) {

        int row = 4;
        int col = 4;
        int r = 0;
        int c = 0;
        boolean[][]  isVisited = new boolean[row][col];
        int count = 0;
        for(int ir =0;ir<row;ir++){
            for(int ic =0;ic < col;ic++){
                if(roboMove(row,col,ir,ic,isVisited)){
                    //count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isSafe(int row,int col,int r,int c,boolean[][] isVisited){
        if(r >=0 && r < row && c >= 0 && c<col && isVisited[r][c] == false){
            return true;
        }
        return false;
    }

    public static boolean roboMove(int row,int col,int r,int c,boolean[][] isvisited){
        if(r == row - 1 && c == col - 1){
            return true;
        }
        int[] rx = {0,0,1,-1};
        int[] cx = {-1,1,0,0};
        for(int i = 0;i<4;i++){
            if(isSafe(row,col,r+rx[i],c+cx[i],isvisited)){
                isvisited[r+rx[i]][c+cx[i]] = true;
                if(roboMove(row,col,r+rx[i],c+cx[i],isvisited)){
                    return true;
                }
                isvisited[r+rx[i]][c+cx[i]] = false;
            }
        }
        return false;
    }
}
