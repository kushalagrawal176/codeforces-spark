import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
 
        while (t-- > 0) 
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
 
            if (a > b) 
                System.out.println((a ^ 1) == b ? y : -1);
            else 
            {
                long c0 = b - a;
                long c1 = ((b + 1) / 2) - ((a + 1) / 2);
                long result = (y > x) ? (c0 * x) : ((c0 - c1) * x + c1 * y);
 
                System.out.println(result);
            }
        }
    }
}