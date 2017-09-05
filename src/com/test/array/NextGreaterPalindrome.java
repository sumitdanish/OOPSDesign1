package com.test.array;

public class NextGreaterPalindrome {
    public static void main(String[] args) {
        int num = 12;
        int len = (String.valueOf(num).length());
        //System.out.println(num/10);
        number(num,len);
    }

    private static void number(int number,int len){
        int sum1 = 0;
        int sum2 = 0;
        int l = (len/2)-1;
        sum1 = (int) (number/Math.pow(10,len/2));
        boolean f9 = false;
        int rev = reverse(sum1);
        int res = (int) (sum1*(Math.pow(10,(len/2))) + rev);
        if(res > number){
            return;//res;
        }else{
            sum2 = (int) (number%Math.pow(10,len/2));
            int n = sum2;
            while(n >0){
                if(n % 10 == 9){
                    f9 = true;
                    break;
                }
                n /= 10;
            }
            n = sum2;
            sum2 = 0;
            int i = 0;
            if(f9){
                while(n >0 && (i < len/2)){
                    int x = n % 10;
                    if(x == 9){
                        sum2 += 0;
                    }else{

                    }
                }
            }
            sum1 = sum1+1;
            int sum11 = reverse(sum1);
            res = (int) (sum1*Math.pow(10,len/2) + sum11);
            System.out.println(res);
        }


    }

    private static int reverse(int num){
        int rev = 0;
        int len = String.valueOf(num).length();
        while(num > 0 && len >= 0){
            int c = num % 10;
            num /= 10;
            rev+=c*Math.pow(10,len-1);
            len--;
        }
        return rev;
    }
}
