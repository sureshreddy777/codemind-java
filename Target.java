import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int p1,p2,p3,p4;
        p1 = md.nextInt();
        p2 = md.nextInt();
        p3 = md.nextInt();
        p4 = md.nextInt();
        if(p1>=10 && p2>=10 && p3>=10 && p4>=10){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}