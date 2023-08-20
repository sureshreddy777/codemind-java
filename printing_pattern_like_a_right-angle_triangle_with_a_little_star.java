import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}