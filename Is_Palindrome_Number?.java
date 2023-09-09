import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int t = n;
        int rem,rev = 0;
        while (n != 0){
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if (rev == t){
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
    }
}