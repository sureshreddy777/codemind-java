import java.util.*;
public class Suresh{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,op;
        n = sc.nextInt();
        op = n*(n-1)/2;
        System.out.printf("%d",op);
    }
}