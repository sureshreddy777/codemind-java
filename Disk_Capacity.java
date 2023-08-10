import java.util.*;
public class Suresh
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int t,s,b,cap;
        t = sc.nextInt();
        s = sc.nextInt();
        b = sc.nextInt();
        cap = 2*t*s*b*512;
        System.out.printf("%d",cap);
    }
}