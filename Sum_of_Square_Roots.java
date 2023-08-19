import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int a,b;
        double sum=0;
        a = md.nextInt();
        b = md.nextInt();
        for (int i=a;i<=b;i++){
            sum+=Math.sqrt(i);
        }
        System.out.printf("%.2f",sum);
    }
}