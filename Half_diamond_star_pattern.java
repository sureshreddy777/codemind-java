import java.util.*;
public class Suresh{
    public static void main(String[] asd){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n>=3 && n<=100){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--)
                System.out.print("*");
            System.out.println();
        }
        }else{
            System.out.print("The pattern is not possible");
        }
    }
}