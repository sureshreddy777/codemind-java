import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        if (n%4 == 0){
            System.out.println(n/4);
        }
        else{
            System.out.println((n/4)+1);
        }
    }
}