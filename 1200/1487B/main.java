import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
                
            if((n&1) == 0)
                System.out.println((k%n) == 0 ? n:k%n);
            else
            {
                long extra = (k-1)/(n/2);
                System.out.println((k+extra)%n == 0 ? n:(k+extra)%n);
            }
        }
    }
}