import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int t,s,b;
        t = md.nextInt();
        s = md.nextInt();
        b = md.nextInt();
        int cap = b*t*s;
        System.out.println(cap+" KB");
    }
}