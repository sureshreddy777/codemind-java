import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner(System.in);
        int u;
        String id,name;
        double c;
        id = md.nextLine();
        name = md.nextLine();
        u = md.nextInt();
        if (u<200){
            c=1.20*u;
        }
        else if (u<400){
            c = 1.50*u;
        }
        else if (u<600){
            c = 1.80*u;
        }
        else{
            c = 2.0*u;
        }
        if (c>400){
            c+=c*0.15;
        }
        else{
            c+=100;
        }
        System.out.printf("%.2f",c);
    }
}