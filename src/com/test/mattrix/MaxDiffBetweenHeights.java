package com.test.mattrix;

/**
 * Created by summit on 5/8/17.
 */
public class MaxDiffBetweenHeights {

    public static void main(String[] args) {
        int[] a = {1, 15, 10};
        int k = 6;
        new MaxDiffBetweenHeights().MinHeight(a,k);

    }

    public int MinHeight(int[] a,int k){
        int minHe = 0;
        int ind = getMin(a);
        int m = a[ind];
        a[ind]+=k;
        for(int i = 0; i < a.length ; i++){
            if(i != ind){
                if(a[i]-m > k){
                    a[i]-=k;
                }else {
                    a[i]+=k;
                }
            }

        }
        for(int l :a){
            System.out.print(l+",");
        }
        return minHe;
    }


    public int getMin(int[] a){
        int min = Integer.MAX_VALUE;
        int minI = 0;
        for(int i = 0; i < a.length ; i++){
            if(min > a[i]){
                min = a[i];
                minI = i;
            }
        }
        return minI;
    }
}
