import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner(System.in);
        for (int i=0;;i++){
            int n = md.nextInt();
            if (n==-1){
                break;
            }
            else{
                System.out.println(n*n);
            }
        }
    }
} 