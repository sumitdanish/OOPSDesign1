package com.test.string;

public class Amazon392Mattrix {
    public static void main(String[] args) {
        char[][] mat = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
        int row = 3;
        int col = 3;
        mattrix(mat,row,col);
    }

    private static void mattrix(char[][] mat,int row,int col){
        String[] str = new String[col * col];
        String firstRow = String.valueOf(mat[0]);
        int i = 0;
        int x = 0;
        while(x < col){
            for(int c = 0;c<col;c++){
                StringBuilder sb = new StringBuilder();
                sb.append(firstRow.charAt(x));
                for(int r = 1;r < row;r++){
                    sb.append(mat[r][c]);
                }
                sb.append("\n");
                str[i] = sb.toString();
                i++;
            }
            x++;
        }
        for(String s : str){
            System.out.println(s);
        }
    }
}

