package com.company;

/**
 * Created by todescudaniela on 7/17/2017.
 */
public class Computer {

    public static int sum(int a, int b){
        return (a+b);
    }

    public double convertFtoC(float F){
        double C = (5.0/9*(F-32));
        return C;
    }

    public int CompareBetweenTwoNr(int a, int b, int n) {
        if(n>=a && n<=b)
            return n;
        else return (a-1);
    }
}
