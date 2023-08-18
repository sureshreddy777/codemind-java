import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
            if (n%i ==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}