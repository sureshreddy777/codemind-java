import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int sq = n*n;
        String s1 = Integer.toString(n);
        String s2 = Integer.toString(sq);
        System.out.println(s2.endsWith(s1)?"Automorphic Number":"Not an Automorphic Number");
    }
}