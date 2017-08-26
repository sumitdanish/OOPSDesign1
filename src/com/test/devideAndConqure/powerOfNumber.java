package com.test.devideAndConqure;
public class powerOfNumber {
    public static void main(String[] args) {
        System.out.println(pow1(2,4));
    }

    //With o(n)
    private static int pow(int x,int y){
        if(y == 0){
            return 1;
        }
        if(y%2 == 0){
            return pow(x,y/2) * pow(x,y/2);
        }
        return x*pow(x,y/2)*pow(x,y/2);
    }

    private static int pow1(int x,int y){
        if(y == 0){
            return 1;
        }
        int temp = pow1(x,y/2);
        if(y%2 == 0){
            return temp * temp;
        }
        return x*temp*temp;
    }
}
