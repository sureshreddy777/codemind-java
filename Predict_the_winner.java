import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = md.nextInt();
        }
        int x = 0,y = 0;
        for (int i:a){
            if (i%2 != 0){
                y += i;
            }
            else{
                x += i;
            }
        }
        int res = Math.abs(x-y);
        if (res%4 == 0){
            System.out.println("X");
        }
        else{
            System.out.println("Y");
        }
    }
}