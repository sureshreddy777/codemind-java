import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int sq = n*n;
        int rev = 0,rem;
        while (n != 0){
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        int sq2 = rev*rev;
        int srem,srev = 0;
        while (sq2 != 0){
            srem = sq2%10;
            srev  = srev *10+srem;
            sq2 = sq2/10;
        }
        if (sq == srev){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}