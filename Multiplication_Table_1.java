import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n;
        n = md.nextInt();
        for (int i=1;i<=12;i++){
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
        
    }
}