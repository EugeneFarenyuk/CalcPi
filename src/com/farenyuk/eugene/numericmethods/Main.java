package com.farenyuk.eugene.numericmethods;
public class Main {
    public static void main(String[] args) {
        double Pi=0;
        // sequence {1,3,5,7,...} has n-th term = 2*n-1.
        // to alternate plus and minus use Math.pow(-1.0, i+1.0).
        for(int i=1; i<=1000; i++)  Pi = Pi + 1.0/(2.0*i-1) * Math.pow(-1.0, i+1.0);
        Pi = 4*Pi;
        System.out.println(Pi);
    }
}
