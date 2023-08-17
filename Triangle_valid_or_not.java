import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int a,b,c;
        a = md.nextInt();
        b = md.nextInt();
        c = md.nextInt();
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Invalid triangle");
        }
    }
}