import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        char ch=md.next().charAt(0);
        char a=Character.toUpperCase(ch);
        if (a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            System.out.println("VOWEL");
        }
        else{
            System.out.println("CONSONANT");
        }
    }
}