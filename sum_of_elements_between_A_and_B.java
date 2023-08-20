import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = md.nextInt();
        }
        int a = md.nextInt();
        int b = md.nextInt();
        int sum = 0;
        for (int i=0;i<n;i++){
            if (a<=arr[i] && b>=arr[i]){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}