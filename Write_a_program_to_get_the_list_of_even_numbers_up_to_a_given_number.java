import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int a,b;
        a = md.nextInt();
        b = md.nextInt();
        for (int i=a;i<=b;i++){
            if (i%2 == 0){
                System.out.print(i+" ");
            }
            //System.out.println();
        }
    }
}