import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md =new Scanner (System.in);
        int n = md.nextInt();
        for (int i=n;i>=1;--i){
            for (int j=1;j<=i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}