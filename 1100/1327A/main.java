import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            if((n&1) == (k&1) && n >= k*k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}