import java.util.*;
public class Suresh{
    public static void main(String args[]){
        Scanner md = new Scanner (System.in);
        int n = md.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = md.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i:arr){
            if (i%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even+" "+odd);
    }
}