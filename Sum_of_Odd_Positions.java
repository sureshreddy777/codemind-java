import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] a = new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        for (int i=0;i<n;i++){
            if (i%2 != 0){
                sum += a[i];
            }
        }
        System.out.printf("%d",sum);
    }
}