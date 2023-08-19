import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        int k = md.nextInt();
        int count=0;
        for (int i=0;i<n;i++){
            if (a[i] == k){
                count++;
            }
        }
        if(count>0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}