import java.util.*;
public class Suresh
{
    public static void main(String args[])
    {
        Scanner md = new Scanner (System.in);
        int n;
        n = md.nextInt();
        if (n%3 == 0 && n%5 != 0 && n%7 != 0)
        {
            System.out.println("Pling");
        }
        else if (n%3 != 0 && n%5 == 0 && n%7 != 0)
        {
            System.out.println("Plang");
        }
        else if (n%3 != 0 && n%5 != 0 && n%7 == 0)
        {
            System.out.println("Plong");
        }
        else if (n%3==0 && n%5==0)
        {
            System.out.println("PlingPlang");
        }
        else if (n%5==0 && n%7==0)
        {
            System.out.println("PlangPlong");
        }
        else if (n%3==0 && n%7==0)
        {
            System.out.println("PlingPlong");
        }
        else
        {
            System.out.println(n);
        }
    }
}