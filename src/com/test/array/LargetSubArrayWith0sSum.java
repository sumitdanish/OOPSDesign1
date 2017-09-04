package com.test.array;

import java.util.HashMap;
import java.util.Map;

public class LargetSubArrayWith0sSum {
    public static void main(String[] args) {
        int[] a = {15, -2, 2, -8, 1, 7, 10, 23};
        subArray(a);
    }

    private static void subArray(int[] a){
        int sum = 0;
        int maxLen = Integer.MIN_VALUE;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < a.length;i++){
            sum+=a[i];
            if(a[i] == 0 && maxLen != 0){
                maxLen = 1;
            }
            if(sum == 0){
                maxLen = i+1;
            }
            Integer previous_sum_index = map.get(sum);
            if(previous_sum_index != null){
                maxLen = max(maxLen,(i-previous_sum_index));
            }else{
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);
    }

    private static int max(int a,int b){
        return a > b ? a : b;
    }
}
