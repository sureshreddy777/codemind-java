import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int s = n*n;
        int sum = 0,rem;
        while (s != 0){
            rem = s%10;
            sum += rem;
            s = s/10;
        }
        System.out.println((n == sum)?"Neon Number":"Not Neon Number");
    }
}