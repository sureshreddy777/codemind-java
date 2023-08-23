import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int rev = 0;
        int rem;
        while (n!=0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}