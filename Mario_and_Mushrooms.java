import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        if (n%3==0){
            System.out.println("NORMAL");
        }
        else if((n+1)%3==0){
            System.out.println("SMALL");
        }
        else{
            System.out.println("HUGE");
        }
    }
}