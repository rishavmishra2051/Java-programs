package com.exchange;

public class P29_MathProblems {
    public static int mySqrt(int x) {
        double sq=Math.sqrt(x);
        return (int)sq;
    }
    public static double myPow(double x, int n) {
        double pow=Math.pow(x,n);
        return pow;
    }
    public static int superPow(int a, int[] b) {
        int n = 1;
        a %= k;
        for (final int i : b)
            n = powMod(n, 10) * powMod(a, i) % k;
        return n;
    }
    private final static int k = 1337;
    private static int powMod(int x, int y) {
        int pow = 1;
        while (y-- > 0)
            pow = (pow * x) % k;
        return pow;
    }

    public static void main(String[] args) {
        //System.out.println(mySqrt(4));
        //System.out.println(myPow(2, 4));
        int b[]={2,0,0};
        System.out.println(superPow(2147483647,b));
    }
}
