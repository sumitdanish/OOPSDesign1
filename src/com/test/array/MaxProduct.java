package com.test.array;

/**
 * Created by summit on 5/21/17.
 */
public class MaxProduct {

    public static void main(String[] args) {
        int[] a = {1, -2, -3, 0, 7, -8, -2};
        System.out.println(new MaxProduct().maxProd(a));
    }


    public int maxSum(int[] a){
        int maxProd = Integer.MIN_VALUE;
        boolean flag = false;
        int s = 0;
        int e = 0;
        int max_prod_so_far = a[0];
        for(int i = 1; i < a.length ; i++){
            if(flag){
                s = i;
                flag = false;
            }
            if(a[i] < (max_prod_so_far+a[i])){
                max_prod_so_far += a[i];
            }else{
                max_prod_so_far = a[i];
            }
            if(max_prod_so_far <= 0){
                flag = true;
                max_prod_so_far = 0;
            }
            else if(maxProd < max_prod_so_far){
                if(!flag) {
                    e = i;
                }
                maxProd = max_prod_so_far;
            }

        }
        System.out.println(s+" : "+e);
        return maxProd;
    }

    public int max(int a, int b){
        return a > b ? a : b;
    }

    public int min(int a,int b){
        return a > b ? b : a;
    }

    public int maxProd(int[] a){
        int maxProd = 1;
        int max_prod_so_far = 1;
        int min_prod_so_far = 1;

        for(int i = 0; i < a.length ; i++){
            if(a[i] > 0){
                max_prod_so_far = max(maxProd,(max_prod_so_far * a[i]));
                min_prod_so_far = min((min_prod_so_far * a[i]),1);
            }else if(a[i] == 0){
                max_prod_so_far = 1;
                min_prod_so_far = 1;
            }
            else{
                int temp = max_prod_so_far;
                max_prod_so_far = max((min_prod_so_far * a[i]),1);
                min_prod_so_far = temp * a[i];
            }
            if(maxProd < max_prod_so_far){
                maxProd = max_prod_so_far;
            }
        }
        return maxProd;
    }

}
