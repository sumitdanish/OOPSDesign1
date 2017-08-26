package com.test.devideAndConqure;

import java.util.ArrayList;
import java.util.List;

public class MattrixPathFromAnyCornerTraversal {
    static int c = 0;
    public static void main(String[] args) {
        int[][] mat ={{ 3, 5, 4, 4, 7, 3, 4, 6, 3 },
                { 6, 7, 5, 6, 6, 2, 6, 6, 2 },
                { 3, 3, 4, 3, 2, 5, 4, 7, 2 },
                { 6, 5, 5, 1, 2, 3, 6, 5, 6 },
                { 3, 3, 4, 3, 0, 1, 4, 3, 4 },
                { 3, 5, 4, 3, 2, 2, 3, 3, 5 },
                { 3, 5, 4, 3, 2, 6, 4, 4, 3 },
                { 3, 5, 1, 3, 7, 5, 3, 6, 4 },
                { 6, 2, 4, 3, 4, 5, 4, 5, 1 }};
        int n = 9;
        int[] v = {0,0,n-1,n-1};
        int[] v1 = {0,n-1,0,n-1};
        boolean[][] visited = new boolean[n][n];
        List<Point> points = new ArrayList<>();
        for(int i = 0; i < 4;i++){
            findPath(visited,mat,points,v1[i],v[i],n,n);
            visited[v1[i]][v[i]] = false;
            if(points.size() > 0) {
                points.remove(points.size() - 1);
            }
        }
        System.out.println(c);
    }

    private static boolean isSafe(boolean[][] visited,int i,int j,int row,int col){
        if( i >= 0 && i < row && j >=0 && j < col && visited[i][j] == false){
            return true;
        }
        return false;
    }

    private static boolean findPath(boolean[][] visited,int[][] mat,List<Point> points,int i,int j,int row,int col){
        if(i == row/2 && j == col/2){
            printPath(points);
            System.out.println();
            return true;
        }

        int[] x = {i-mat[i][j],i+mat[i][j],i,i};
        int[] y = {j,j,j+mat[i][j],j-mat[i][j]};
        for(int k = 0;k<4;k++){
            if(isSafe(visited,x[k],y[k],row,col)){
                Point p = new Point(x[k],y[k]);
                visited[x[k]][y[k]] = true;
                points.add(p);
                if(findPath(visited,mat,points,x[k],y[k],row,col)) {
                    c++;
                    return true;
                }
                visited[x[k]][y[k]] = false;
                points.remove(points.indexOf(p));
            }
        }
        return false;
    }

    private static void printPath(List<Point> path){
        for (Point p : path){
            System.out.print("("+p.x+","+p.y+")");
        }
    }

    static class Point{
        public int x;
        public int y;
        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

}
