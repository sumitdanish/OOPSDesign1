package com.test.array;

/**
 * Created by summit on 8/4/17.
 */
public class BuyAndSell {
    public static void main(String[] args) {
        int[] a = {10, 22, 5, 75, 65, 80};
        buyAndSell(a);
    }

    public static void buyAndSell(int[] price){
        int[] profit = new int[price.length];
        int maxPrice = Integer.MIN_VALUE;
        for(int i = price.length - 2;i >= 0; i--){
            if(price[i] > maxPrice){
                maxPrice = price[i];
            }
            profit[i] = max(profit[i+1],maxPrice - price[i]);
        }

        int minPrice = price[0];
        for(int i = 1; i < price.length;i++){
            if(minPrice > price[i]){
                minPrice = price[i];
            }
            profit[i] = max(profit[i-1],price[i] - minPrice+profit[i]);
        }
        System.out.println(profit[price.length - 1]);
    }

    public static int max(int a,int b){
        return a > b ? a : b;
    }
}
