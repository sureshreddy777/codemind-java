import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n,a,b;
        n = md.nextInt();
        for (int i=0;i<n;i++){
            a = md.nextInt();
            b = md.nextInt();
            if((b/a)/2>=1 || a==b) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}