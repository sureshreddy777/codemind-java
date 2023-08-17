import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        if (n%2 !=0 || (n>=6 &&n<=20)){
            System.out.println("weird");
        }
        else
        System.out.println("not weird");
    }
}