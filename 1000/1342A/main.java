import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) 
        {
            long x = sc.nextLong();
            long y = sc.nextLong();
            
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            long cost;
            if (x == y)
                cost = Math.min(x * b, (x + y) * a);
            else if (x > y)
                cost = Math.min(y * b + (x - y) * a, (x + y) * a);
            else
                cost = Math.min(x * b + (y - x) * a, (x + y) * a);
            
            System.out.println(cost);
        }
    }
}
