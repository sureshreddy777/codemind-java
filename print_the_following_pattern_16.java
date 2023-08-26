import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}