import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n,m,k;
        n = md.nextInt();
        m = md.nextInt();
        k = md.nextInt();
        if (k*m>=n){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}