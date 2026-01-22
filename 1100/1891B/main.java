import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            long a[] = new long[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextLong();
            
            int k = 31;
            while(m-- > 0)
            {
                int x = sc.nextInt();
                if(x >= k)
                    continue;
                    
                for(int i=0;i<n;i++)
                {
                    if(a[i]%(long)Math.pow(2, x) == 0)
                        a[i] = (long)(a[i] + Math.pow(2, x-1));
                }
                
                k = x;
            }
            
            for(int i=0;i<n;i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}