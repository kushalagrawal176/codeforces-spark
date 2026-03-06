import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long temp = 0;
            long max = Long.MIN_VALUE;
            
            for(int i=0;i<n;i++)
            {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                
                temp += (b-1)*a;
                max = Math.max(max, a*b-c);
            }
            
            if(temp >= x) 
                System.out.println(0);
            else if(max <= 0) 
                System.out.println(-1);
            else
                System.out.println((x-temp+max-1)/max);
        }
    }
}