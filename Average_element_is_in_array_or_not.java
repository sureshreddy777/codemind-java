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
            sum+=a[i];
        }
        int avg = sum/n;
        int count = 0;
        for (int i=0;i<n;i++){
            if (avg == a[i]){
                count++;
            }
        }
        if (count>0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}