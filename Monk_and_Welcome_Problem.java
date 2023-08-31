import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        for (int i=0;i<n;i++){
            b[i] = md.nextInt();
        }
        int[] c = new int[n];
        for (int i=0;i<n;i++){
            c[i] = a[i]+b[i];
            System.out.print(c[i]+" ");
        }
    }
}