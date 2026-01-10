import java.util.*;
public class main
{
    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
 
        return gcd(b, a % b);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = Math.abs(sc.nextInt()-1);
            
            for(int i=2;i<=n;i++)
                k = gcd(k, Math.abs(sc.nextInt()-i));
            
            System.out.println(k);
        }
    }
}