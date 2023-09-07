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
        for (int i:a){
            sum += i;
        }
        int avg = sum/n;
        int count = 0;
        for (int i:a){
            if (i >= avg){
                count++;
            }
        }
        System.out.println(count);
    }
}