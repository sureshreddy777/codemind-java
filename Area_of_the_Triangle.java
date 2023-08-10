import java.util.*;
public class Suresh{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double s,area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s = (double)(a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}