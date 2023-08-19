import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n,a,b;
        n = md.nextInt();
        a = md.nextInt();
        b = md.nextInt();
        for (int i=a;i<=b;i++){
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
        
    }
}