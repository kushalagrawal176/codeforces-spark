import java.util.*;
public class main
{
    public static long TotalCards(int height)
    {
        return (3L*height*height + height)/2;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextInt();
            
            int cnt = 0;
            while(n >= 2)
            {
                int low = 1;
                int high = 100000;
                int height = 0;
                
                while(low <= high)
                {
                    int mid = low + (high-low)/2;
                    
                    if(TotalCards(mid) <= n)
                    {
                        height = mid;
                        low = mid+1;
                    }
                    else
                        high = mid-1;
                }
                
                n -= TotalCards(height);
                cnt++;
            }
            
            System.out.println(cnt);
        }
    }
}