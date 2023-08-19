import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int ssq = n*(n+1)*(2*n+1)/6;
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        int sqs = sum*sum;
        int diff = sqs - ssq;
        System.out.println(diff);
    }
}