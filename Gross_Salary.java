import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        double da,hra;
        if(n<=10000){
            da = n*0.8;
            hra = n*0.2;
            System.out.printf("%.2f",n+da+hra);
        }
        else if(n<=20000){
            da = n*0.9;
            hra = n*0.25;
            System.out.printf("%.2f",n+da+hra);
        }
        else{
            da = n*0.95;
            hra = n*0.3;
            System.out.printf("%.2f",n+da+hra);
        }
    }
}