import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int sum = 0,pro = 1,rem;
        while (n != 0){
            rem = n%10;
            sum += rem;
            pro *= rem;
            n = n/10;
        }
        System.out.println(pro-sum);
    }
}