import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int x = md.nextInt();
        int y = md.nextInt();
        int z = 30*y;
        if(x>=z){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}