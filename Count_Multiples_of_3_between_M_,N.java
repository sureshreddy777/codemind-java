import java.util.*;
public class Suresh{
public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int a,b,count=0;
        a = md.nextInt();
        b = md.nextInt();
        for (int i=a;i<=b;i++){
            if (i%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}