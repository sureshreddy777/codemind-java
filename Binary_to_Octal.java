import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int q = md.nextInt();
        md.nextLine();
        for (int i=0;i<q;i++){
            String b = md.next();
            int s = Integer.parseInt(b,2);
            String oct = Integer.toOctalString(s);
            System.out.println(oct);
        }
    }
}