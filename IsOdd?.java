import java.util.*;
public class Suresh{
    public static int isOdd(int n){
        if (n%2 !=0){
            return 2;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int Odd = isOdd(n);
        System.out.println(Odd);
    }
}