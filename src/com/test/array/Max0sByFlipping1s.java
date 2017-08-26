package com.test.array;

/**
 * Created by summit on 5/23/17.
 */
public class Max0sByFlipping1s {
    public static void main(String[] args) {
        int[] a = {1,1,1,0, 1, 0, 0, 1,0, 1, 0, 1, 0 , 0 , 1, 0};
        new Max0sByFlipping1s().max0sByFlip1ss(a);
    }

    public void max0sByFlip1s(int[] a){
        int Count0S = 0;
        int max0s = 0;
        for(int i = 0; i < a.length ; i++){
            if(a[i] == 0){
                Count0S++;
            }
            int count0s = 0;
            int count1s = 0;
            for(int j = i; j < a.length ; j++){
                if(a[j] == 0){
                    count0s++;
                }else{
                    count1s++;
                }
            }
            if(max0s < (count1s - count0s)){
                max0s = count1s - count0s;
            }
        }
        System.out.println((Count0S+max0s));
    }

    public void max0sByFlip1ss(int[] a){
        int max_so_far = 0;
        int max = 0;
        boolean f = true;
        int st = 0;
        int end = 0;

        for(int i = 0; i <a.length ; i++){
            if(f){
                st = i;
                f = false;
            }
            if(a[i] == 0){
                max_so_far-=1;
            }else{
                max_so_far+=1;
            }
            if(max_so_far <= 0){
                max_so_far = 0;
                f = true;
            }else if(max < max_so_far){
                if(!f){
                    end = i;
                }
                max = max_so_far;
            }
        }

        int i = st;
        int x = 0;
        while(i-1 >=0 && a[i-1] ==0){
            x++;
            i--;
        }
        i = end;
        while(i+1 < a.length && a[i+1] == 0){
            x++;
            i++;
        }
        x = x + (end - st + 1);
        System.out.println(Math.abs(x));
    }

}
