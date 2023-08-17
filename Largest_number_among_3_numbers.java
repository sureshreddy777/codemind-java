import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n1,n2,n3;
        n1 = md.nextInt();
        n2 = md.nextInt();
        n3 = md.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println(n1);
        }
        else if (n2>n1&&n2>n3){
            System.out.println(n2);
        }
        else{
            System.out.println(n3);
        }
    }
}