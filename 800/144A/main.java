import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int p = 0, q = 0;
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            
            if (a > mx) {
                mx = a;
                p = i; // index of leftmost tallest
            }
            if (a <= mn) {
                mn = a;
                q = i; // index of rightmost shortest
            }
        }
        
        int result;
        if (p > q) {
            result = (p - 1) + (n - q) - 1;
        } else {
            result = (p - 1) + (n - q);
        }
        
        System.out.println(result);
    }
}
