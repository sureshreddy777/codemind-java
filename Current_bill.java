import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int u= md.nextInt();
        double cost;
        if (u<200){
            cost = u*1.20;
        }
        else if(u<400) {
            cost = u*1.50;
        }
        else if(u<600){
            cost = u*1.80;
        }
        else{
            cost = u*2.0;
        }
        if (cost>400){
            cost+=(cost*0.15);
        }
        else{
            cost+=100;
        }
        System.out.printf("%.2f",cost);
    }
}