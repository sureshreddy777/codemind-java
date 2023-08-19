import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int a,b;
        a = md.nextInt();
        b = md.nextInt();
        for (int i=1;i<=b;i++){
            System.out.printf("%d x %d = %d
",a,i,a*i);
        }
        
    }
}