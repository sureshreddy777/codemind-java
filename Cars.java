import java.util.*;
public class Suresh
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n1,n2,x;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        x = sc.nextInt();
        if (n1>n2)
        {
            System.out.println("-1");
        }
        else 
        {
            int count = 1;
            int a,b;
            a = n1;
            b = n2;
            while (x+a>=b)
            {
                count++;
                a+=n1;
                b+=n2;
            }
            System.out.println(count);
        }
    }
}