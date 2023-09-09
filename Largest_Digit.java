import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int rem,max = 0;
        while (n != 0){
            rem = n%10;
            if (rem > max){
                max = rem;
            }
            n = n/10;
        }
        System.out.println(max);
    }
}