import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n1,n2;
        n1 = md.nextInt();
        n2 = md.nextInt();
        double avg = (double)(n1+n2)/2;
        System.out.printf("Average of %d and %d is: %.2f",n1,n2,avg);
    }
}