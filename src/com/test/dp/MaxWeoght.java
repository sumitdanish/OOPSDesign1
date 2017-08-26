package com.test.dp;

public class MaxWeoght {
    public static void main(String[] args) {
        int[] val = {1,2,5,9,4};
        int[] wt = {2,3,3,4,6};
        int w = 10;
        maxCost(val,wt,w);
    }

    private static void maxCost(int[] price,int[] weight,int w){
        int[][] totalMaxPrice = new int[price.length+1][w+1];


        for(int i = 0; i <= price.length;i++){
            for(int j=0;j<=w;j++){
                if(i ==0 || j == 0){
                    totalMaxPrice[i][j] = 0;
                }
                else if(weight[i-1] <= j){
                    totalMaxPrice[i][j]= maxPrice(price[i-1]+totalMaxPrice[i-1][j - weight[i-1]],totalMaxPrice[i-1][j]);
                }else{
                    totalMaxPrice[i][j] = totalMaxPrice[i-1][j];
                }
            }
        }
        System.out.println(totalMaxPrice[price.length][w]);

    }

    private static int maxPrice(int a,int b){
        return a > b ? a : b;
    }
}
