import java.util.*;
public class suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int sum = 1;
        for (int i=1;i<n;i++){
            if (n%i == 0){
                sum += i;
            }
        }
        if (sum > n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}