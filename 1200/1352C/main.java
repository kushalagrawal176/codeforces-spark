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
            
            long low = 1;
            long high = k*n;
            
            while(low <= high)
            {
                long mid = low + (high-low)/2;
                
                if(mid-(mid/n) >= k)
                    high = mid-1;
                else
                    low = mid + 1;
            }
            
            System.out.println(low);
        }
    }
}