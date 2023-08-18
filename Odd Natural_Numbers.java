import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        for (int i=1;i<=n;i++){
            if(i%2 !=0){
                System.out.printf("%d ",i);
            }
        }
    }
}