package com.test.mattrix;

import java.util.ArrayList;

/**
 * Created by summit on 5/3/17.
 */
public class MinCoinChain {
    ArrayList<Integer> a1 = new ArrayList<>();
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int sum = 4;
        int len = 3;
        int val = new MinCoinChain().minCoin(a,sum,len);
        System.out.println(val);
    }

    public int minCoin(int[] a,int sum,int len){
        if(sum == 0){
            for(int a2 : a1){
                System.out.print(a2+",");
            }
            System.out.println();
            a1.clear();
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(len <= 0 && sum >= 1){
            return 0;
        }
        return minCoin(a,sum - a[len -1],len)+minCoin(a,sum,len-1);
    }

    public int max(int a,int b){
        return a > b ?a : b;
    }
}
