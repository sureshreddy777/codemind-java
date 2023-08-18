import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n1,n2,n3,n4,n5;
        n1 = md.nextInt();
        n2 = md.nextInt();
        n3 = md.nextInt();
        n4 = md.nextInt();
        n5 = md.nextInt();
        if(n1>34 && n2>34 &&n3>34 &&n4>34 &&n5>34){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }
    }
}