import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long n = sc.nextLong();
            
            long max = (a>b ? a>c ? a:c : b>c ? b:c);
            long ans = n - 3*max + a + b + c;
 
            System.out.println(ans%3 == 0 && ans >= 0 ? "YES":"NO");
        }
    }
}