import java.util.*;

public class Suresh {
    public static void main(String args[]) {
        Scanner md = new Scanner(System.in);
        int n = md.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = md.nextInt();
        }
        int count = 0;
        int a = md.nextInt();
        int b = md.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] < a || arr[i] > b) {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        
        if (count == 0){
            System.out.print(-1);
        }
    }
}
