import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int count = 0;
        for (int i=2;i<n;i++){
            if (n%i == 0){
                count++;
            }
        }
        if (count == 0){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}