import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int count =0;
        int[] a= new int[n];
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        for (int i=0;i<n;i=i+2){
            if (a[i]%2 !=0){
                count++;
            }
        }
            
        if (count != 0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}