import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int m,n,count=0;
        m = md.nextInt();
        n = md.nextInt();
        for (int i=m;i<=n;i++){
            if (i%3 ==0 && i%2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}