package com.ding.algorithms.math;

import java.math.BigInteger;

/**
 * 阶乘 n！
 */
public class Factorial {
    /**
     * 用循环累乘求n的阶乘 大数会溢出
     * @param n
     * @return
     */
    public static long  doFactorial1(long n){
        int r = 1;
        for(long i = n;i > 0;i--){
            r *= i;

        }

        return r;
    }
    /**
     * 用递归求n的阶乘 大数会溢出
     * @param n
     * @return
     */
    public static long doFactorial2(long n){

        if(n == 1){
            return 1;
        }else{
            return n * doFactorial2(n-1);
        }

    }

    /**
     * 大数的计算
     * @param n
     * @return
     */
    private static BigInteger doFactorial3(int n) {
        BigInteger result = new BigInteger("1");
        while(n!=1) {
            result = result.multiply(BigInteger.valueOf(n--));
        }
        return result;
    }
    public static void main(String[] args){

        System.out.println(doFactorial1(33)); //会溢出
        System.out.println(doFactorial2(5));
        System.out.println(doFactorial3(5));
        System.out.println(doFactorial3(33));
    }


}
