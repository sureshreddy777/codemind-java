import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        double p,r,t;
        p = md.nextDouble();
        r = md.nextDouble();
        t = md.nextDouble();
        double ci = p * Math.pow((1 + (r / 100)), t);
        System.out.printf("%.2f",ci);
    }
}