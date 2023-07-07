package com.aditi;

public class Fiborec {
    public static void main(String[] args) {
        System.out.println(fib(7));

    }
    static int fib(int n){
        //base condition
        if(n<2)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
