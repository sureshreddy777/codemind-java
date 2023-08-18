import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int x,a,b;
        x = md.nextInt();
        a = md.nextInt();
        b = md.nextInt();
        int t = a*1+b*2;
        if(t>=x){
            System.out.println("Qualify");
        }
        else{
            System.out.println("Not Qualify");
        }
    }
}