import java.util.*;
public class suresh{
    public static void main(String args[]){
        Scanner md= new Scanner (System.in);
        int a= md.nextInt();
        int b= md.nextInt();
        for(int i=a+1;i<b;i++){
            System.out.printf("%d %d %d
",i,i*i,i*i*i);
        }
    }
}