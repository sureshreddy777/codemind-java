import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n,k;
        n = md.nextInt();
        k = md.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        int count = 0;
        for (int i:a){
            if (i%k != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}