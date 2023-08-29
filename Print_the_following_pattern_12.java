import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int c = 1;
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
            c=i+1;
        }
    }
}