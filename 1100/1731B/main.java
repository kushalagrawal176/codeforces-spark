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
 
            long p = 1000000000+7;
            long val = 337 * n%p * (n+1)%p * (4*n-1)%p;
 
            System.out.println(val);
        }
  }
  
}