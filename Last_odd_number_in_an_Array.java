import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        int odd = 0;
        for (int i:a){
            if (i%2 != 0){
                odd = i;
            }
        }
        System.out.println(odd);
    }
}