import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int r = md.nextInt();
        for (int i=1;i<=r;i++){
            if (i%2 != 0){
                System.out.println(n+" x "+i+" = "+n*i);
            }
        }
    }
}