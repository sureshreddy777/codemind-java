import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int factorial = 1;
        for (int i=1;i<=n;i++){
            factorial *= i;
        }
        System.out.print(factorial);
    }
}