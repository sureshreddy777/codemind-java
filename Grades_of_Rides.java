import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int x,y,z;
        x = md.nextInt();
        y = md.nextInt();
        z = md.nextInt();
        if (x>50 && y>60 && z>100){
            System.out.println("10");
        }
        else if (x>50 && y>60 && z<100){
            System.out.println("9");
        }
        else if (x<50 && y>60 && z>100){
            System.out.println("8");
        }
        else if (x>50 && y<60 && z>100){
            System.out.println("7");
        }
        else if (x>50 || y>60 || z>100){
            System.out.println("6");
        }
        else{
            System.out.println("5");
        }
    }
}