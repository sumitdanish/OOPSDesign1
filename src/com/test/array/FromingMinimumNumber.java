package com.test.array;


/*
*http://www.geeksforgeeks.org/form-minimum-number-from-given-sequence/
*
* */
public class FromingMinimumNumber {
    public static void main(String[] args) {
        minimumNumber("IDID");
    }

    private static void minimumNumber(String s){
        int currentMax = 0;
        int max_so_far = 0;
        int nd = 0;
        for(int i = 0; i <s.length();i++){
            if(s.charAt(i) == 'I'){
                int j = i+1;
                while(j < s.length() && s.charAt(j) == 'D'){
                    nd++;
                    j++;
                }
                if(i == 0){
                    currentMax+=nd+2;
                    System.out.print(++max_so_far+",");
                    System.out.print(currentMax+",");
                    max_so_far = currentMax;
                }else{
                    currentMax+=nd+1;
                    System.out.print(currentMax+",");
                    max_so_far = currentMax;
                }
                for(int k = 0; k < nd;k++){
                    System.out.print(--max_so_far+",");
                }
                i++;
            }
            else if(s.charAt(i) == 'D'){
                int j = i+1;
                nd=0;
                while(j < s.length() && s.charAt(j) == 'D'){
                    nd++;
                    j++;
                }
                if(i == 0){
                    currentMax+=nd+2;
                    System.out.print(currentMax+",");
                    System.out.print((currentMax-1)+",");
                    max_so_far = currentMax-1;
                }else{
                    System.out.print((max_so_far-1));
                    max_so_far-=1;
                }
                i++;
            }

        }
    }
}
