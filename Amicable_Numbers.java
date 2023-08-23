import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n,m;
        n = md.nextInt();
        m = md.nextInt();
        int nsum = 0;
        int msum = 0;
        for (int i=1;i<n;i++)
        {
            if (n%i == 0){
                nsum += i;
            }
        }
        for (int i=1;i<m;i++){
            if (m%i == 0){
                msum +=i;
            }
        }
        if (nsum == m && msum == n){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
    }
}