package com.test.backtracking;

public class Permutation {
    public static void main(String[] args) {
        char[] ch = "Sumit".toCharArray();
        //permute(ch,ch.length);
        perutation1("","AB");
    }

    private static void permute(char[] ch,int r){
        if(r == 1){
            System.out.println(String.valueOf(ch));
            return;
        }
        for(int i = 0;i<r;i++){
            swap(ch,i,r-1);
            permute(ch,r-1);
            swap(ch,i,r-1);
        }
    }

    private static void swap(char[] ch1,int i,int j){
        char temp = ch1[i];
        ch1[i] = ch1[j];
        ch1[j] = temp;
    }

    private static void perutation1(String prefix,String s){
        if(s.length() == 0){
            System.out.println(prefix);
            return;
        }
        for(int i = 0; i < s.length() ; i++){
            perutation1(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1));
        }
    }
}
