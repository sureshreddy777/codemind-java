import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] a = new int[n];
        double sum = 0;
        double avg;
        for(int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        avg = sum/n;
        System.out.printf("%.2f",avg);
    }
}