import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
            System.out.print((char)(65+i)+" ");
            }
            System.out.println();
        }
    }
}