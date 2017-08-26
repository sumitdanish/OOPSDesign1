package com.test.array;

/**
 * Created by summit on 5/23/17.
 */
public class MaxxArrayByFlipping0s {
    public static void main(String[] args) {
        int[] a = {1, -1, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        new MaxxArrayByFlipping0s().max1s(a,2);
    }

    public void maxArrayFlip0s(int[] a,int m){
        int i = 0;
        boolean f1 = false;
        boolean f2 = false;
        int max = Integer.MIN_VALUE;
        int s11 = 0;
        int s22 = 0;
        int m1 = m;
        for(i = 0; i <a.length ; i++){
            int j = i;
            f1 = false;
            f2 = false;
            int cl = 0;
            int cr = 0;
            int s1 =0;
            int s2 = 0;
            m1 = m;
            while(j >= 0 && m1 > 0){
                if(a[j] == 0){
                    if(f1 == false){
                        s1 = j;
                        f1 = true;
                    }
                    m1--;
                }
                j--;
                cl++;
            }
            j = i+1;
            m1 = m;
            while(j < a.length && m1 > 0){
                if(a[j] == 0){
                    if(f2 == false){
                        //f1 = false;
                        f2 = true;
                        s2 = j;
                    }
                    m1--;
                }
                j++;
                cr++;
            }
            if(max < (cl+cr)){
                max = (cl+cr);
                s11 = s1;
                s22 = s2;
            }
        }
        System.out.println(s11+" : "+s22+" : "+max);
    }

    public void max1s(int[] a,int m){

    }
}
