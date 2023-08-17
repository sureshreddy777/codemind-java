import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        char ch = md.next().charAt(0);
        if(ch == 'V'){
            System.out.println("Violet");
        }
        if(ch == 'B'){
            System.out.println("Blue");
        }
        else if(ch == 'I'){
            System.out.println("Indigo");
        }
        else if(ch == 'G'){
            System.out.println("Green");
        }
        else if(ch == 'Y'){
            System.out.println("Yellow");
        }
        else if(ch == 'O'){
            System.out.println("Orange");
        }
        else if(ch == 'R'){
            System.out.println("Red");
        }
        else{
            System.out.println("-1");
        }
    }
}