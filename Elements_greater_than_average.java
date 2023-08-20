import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        int sum = 0;
        for (int i=0;i<n;i++){
            sum+=a[i];
        }
        int avg = sum/n;
        int count = 0;
        for (int i=0;i<n;i++){
            if (a[i]>=avg){
                count++;
            }
        }
        System.out.println(count);
    }
}