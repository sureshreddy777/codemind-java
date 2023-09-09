import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int t = md.nextInt();
        int a;
        for (int i=0;i<t;i++){
            a = md.nextInt();
            int n = a;
            int rev = 0,rem;
            while (a != 0){
                rem = a%10;
                rev = rev*10+rem;
                a = a/10;
            }
            if (n == rev){
                System.out.println("True");
            }
            else    System.out.println("False");
        }
    }
}