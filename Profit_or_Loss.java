import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int cp,sp;
        cp = md.nextInt();
        sp = md.nextInt();
        if(sp>cp){
            System.out.println("Profit");
        }
        else if(cp>sp){
            System.out.println("Loss");
        }
        else{
            System.out.println("No profit and No loss");
        }
    }
}