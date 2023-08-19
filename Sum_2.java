import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int a,b,x,y,sum=0;
        a = md.nextInt();
        b = md.nextInt();
        x = md.nextInt();
        y = md.nextInt();
        for (int i=a;i<=b;i++){
            if (i%x == 0 && i%y !=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}