import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int x,y,m;
        x = md.nextInt();
        y = md.nextInt();
        m = md.nextInt();
        int res = (int)(Math.pow(x,y)%m);
        System.out.println(res);
    }
}