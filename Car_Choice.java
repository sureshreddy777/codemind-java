import java.util.*;
public class Suresh
{
    public static void main(String args[])
    {
        Scanner md = new Scanner(System.in);
        int t;
        double x1,x2,y1,y2;
        t = md.nextInt();
        for(int i=0;i<t;i++)
        {
            x1 = md.nextInt();
            x2 = md.nextInt();
            y1 = md.nextInt();
            y2 = md.nextInt();
            double c1,c2;
            c1 = x1/y1;
            c2 = x2/y2;
            if (c1<c2)
            {
                System.out.println("1");
            }
            else if (c1>c2)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println("0");
            }
        }
    }
}