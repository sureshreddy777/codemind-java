import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int t,rem,r =0;
        t = n;
        while (n!=0){
            rem = n%10;
            r = r*10+rem;
            n = n/10;
        }
            System.out.println(r);
        
    }
}