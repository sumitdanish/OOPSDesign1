package com.test.string;

/**
 * Created by summit on 5/24/17.
 */
public class SortStringWithoutCopying {
    public static void main(String[] args) {
        String[] str = {"geeks", "for", "geeks", "quiz"};
        new SortStringWithoutCopying().sorted(str);
    }

    public void sorted(String[] str){
        int min = Integer.MAX_VALUE;
        int[] in = new int[str.length];
        for(int i = 0; i <str.length ; i++){
            in[i] = i;
        }
        for(int p = 0;p<str.length ; p++){
            min = p;
            for(int j = p + 1 ; j < str.length ; j++){
                if(str[in[p]].compareTo(str[in[j]]) > 0){
                    min = j;
                }
            }
            if(min != p){
                int tmp = in[p];
                in[p] = in[min];
                in[min] = tmp;
            }
        }

        for(int i = 0 ;i < str.length ; i++){
            System.out.print(str[in[i]]+",");
        }
        System.out.println();
    }
}
