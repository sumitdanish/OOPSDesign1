package com.test.mattrix;

/**
 * Created by summit on 3/12/17.
 */
public class SearchInSortedMattrix {
    public static void main(String[] args) {
        int[][] mat = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int row = 4;
        int col = 4;

        boolean b = new SearchInSortedMattrix().isElementExist(mat,row,col,28);
        System.out.println(b);
    }

    public boolean isElementExist(int[][] mat,int row,int col,int key){
        int c = col - 1;
        int r = 0;
        while(c >= 0 && r < row){
            if(mat[c][r] == key){
                System.out.println("element exist");
                return true;
            }else if(key < mat[c][r]){
                c--;
            }else{
                r++;
            }
        }

        return false;
    }
}
