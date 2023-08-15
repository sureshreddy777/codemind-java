import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int x,y;
        x = md.nextInt();
        y = md.nextInt();
        if (x%2 == 0 && (x>0 || y%2 == 0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}