import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt(),max=0;
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        max = a[0];
        for (int i=0;i<n;i++){
            
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}