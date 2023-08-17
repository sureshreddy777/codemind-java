import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        char ch;
        ch = md.nextLine().charAt(0);
        if(ch>='A'&& ch<='Z'){
            System.out.println("uppercase alphabet");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("lowercase alphabet");
        }
        else{
            System.out.println("not an alphabet");
        }
    }
}