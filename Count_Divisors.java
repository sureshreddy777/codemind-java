import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int l,r,k;
        l = md.nextInt();
        r = md.nextInt();
        k = md.nextInt();
        int count = 0;
        for (int i=l;i<=r;i++){
            if (i%k == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}