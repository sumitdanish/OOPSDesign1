package com.test.array;

public class SubsequenceOfSize3 {
    public static void main(String[] args) {
        int[] a = {4,3,2,1};
        /*
        * Test case :
        * Input:  arr[] = {12, 11, 10, 5, 6, 2, 30}
            Output: 5, 6, 30

            Input:  arr[] = {1, 2, 3, 4}
            Output: 1, 2, 3 OR 1, 2, 4 OR 2, 3, 4

            Input:  arr[] = {4, 3, 2, 1}
            Output: No such triplet
        *
        *
        * */
        smallest(a);
    }
    private static void subsequence(int[] a){
        int[] smallestLeft = new int[a.length];
        int[] rightGreatest = new int[a.length];
        int min = 0;
        int max = a.length-1;
        smallestLeft[0] = -1;
        rightGreatest[a.length-1] = -1;
        for(int i = 0;i<a.length;i++){
            if(a[i] <= a[min]){
                min = i;
                smallestLeft[i] = -1;
            }else {
                smallestLeft[i] = min;
            }
        }
        for(int i = a.length-2;i>=0;i--){
            if(a[max] <= a[i]){
                max = i;
                rightGreatest[i] = -1;
            }else {
                rightGreatest[i] = max;
            }
        }

        for(int i =0;i<a.length;i++){
            if(smallestLeft[i] != -1 && rightGreatest[i] != -1){
                System.out.println(a[smallestLeft[i]]+" : "+a[i]+" : "+a[rightGreatest[i]]);
                break;
            }
        }
    }

    private static void smallest(int[] a){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int ind = 0;
        int i = 0;
        for(i = 0; i+1 < a.length;i++){
            if(a[i] < a[i+1]){
                max1 = a[i];
                max2 = a[i+1];
                ind = i;
                break;
            }
        }
        if(i == a.length-1){
            System.out.println("No Subsequence exist !!!");
            return;
        }
        int third = 0;
        while(ind < a.length){
            if(a[ind] > max1 && a[ind] > max2){
                third = a[ind];
                break;
            }
            ind++;
        }

        System.out.println(max1+" : "+max2+": "+third);

    }
}

