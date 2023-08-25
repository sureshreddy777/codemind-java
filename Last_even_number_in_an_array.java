import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        int s = 0;
        for (int i=0;i<n;i++){
            if (a[i]%2 == 0){
                s = a[i];
            }
        }
        System.out.println(s);
    }
}