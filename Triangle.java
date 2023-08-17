import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int a,b,c;
        a = md.nextInt();
        b = md.nextInt();
        c = md.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("Equilateral triangle");
        }
        else if(a==b || a==c || b==c){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }
    }
}