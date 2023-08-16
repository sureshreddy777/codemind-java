import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n,sum=0;
        n = md.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=md.nextInt();
        }
        for (int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.print(sum);
    }
}