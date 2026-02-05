import java.util.*;
public class main
{
    public static int isPrime(int a)
    {
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i == 0)
                return i;
        }
        
        return -1;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            if(r <= 3)
                System.out.println(-1);
            else
            {
                if(l-r == 0 && isPrime(r) == -1)
                    System.out.println(-1);
                else
                {
                    if(isPrime(r) == -1)
                    {
                        int a = isPrime(r-1);
                        System.out.println(a+" "+(r-1-a));
                    }
                    else
                    {
                        int a = isPrime(r);
                        System.out.println(a+" "+(r-a));
                    }
                }
            }
        }
    }
}
