import java.util.*;
public class Suresh
{
    public static void main(String args[])
    {
        Scanner md = new Scanner (System.in);
        int hf,sf,sef;
        hf = md.nextInt();
        sf = md.nextInt();
        sef = md.nextInt();
        if (hf>50 && sf>60 && sef>100)
        {
            System.out.println("10");
        }
        else if (hf>50 && sf>60 && sef<100)
        {
            System.out.println("9");
        }
        else if (sef>100 && sf>60 && hf<50)
        {
            System.out.println("8");
        }
        else if (hf>50 && sef>100 && sf<60)
        {
            System.out.println("7");
        }
        else if (hf>50 || sf>60 || sef>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}