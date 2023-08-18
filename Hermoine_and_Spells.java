import java.util.*;
public class Suresh{
    public static void main(String args[])
    {
        Scanner md = new Scanner (System.in);
        int a,b,c;
        a  = md.nextInt();
        b = md.nextInt();
        c = md.nextInt();
        int x=a+b;
        int y= b+c;
        int z=c+a;
        if (x>y && x>z){
            System.out.println(x);
        }
        else if (y>x && y>z){
            System.out.println(y);
        }
        else {
            System.out.println(z);
        }
    }
}