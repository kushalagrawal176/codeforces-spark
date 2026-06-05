import java.util.*;
public class main
{
    public static boolean isPrime(long n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i == 0)
                return false;
        }

        return true;
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            int k = sc.nextInt();
            
            boolean prime = isPrime(n);
            
            if(prime == false)
                System.out.println("NO");
            else
            {
                if(n == 1)
                {
                    if(k == 2)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else
                {
                    if(k == 1)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }
}