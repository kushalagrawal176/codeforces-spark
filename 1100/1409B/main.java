import java.util.*;
 
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) 
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
            
            // Option 1: reduce a first
            long reduceA = Math.min(n, a - x);
            long newA = a - reduceA;
            long remainingN = n - reduceA;
            long newB = b - Math.min(remainingN, b - y);
            long product1 = newA * newB;
            
            // Option 2: reduce b first
            long reduceB = Math.min(n, b - y);
            long newB2 = b - reduceB;
            long remainingN2 = n - reduceB;
            long newA2 = a - Math.min(remainingN2, a - x);
            long product2 = newA2 * newB2;
            
            System.out.println(Math.min(product1, product2));
        }
    }
}