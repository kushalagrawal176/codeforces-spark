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
            long a[] = new long[n];
            
            a[0] = sc.nextLong();
            for(int i=1;i<n;i++)
                a[i] = a[i-1] + sc.nextLong();
            
            ArrayList<Integer> factors = new ArrayList<Integer>();
            for(int i=1;i<=n;i++)
            {
                if(n%i == 0)
                    factors.add(i);
            }
            
            long maxi = Long.MIN_VALUE;
            for(int i=0;i<factors.size();i++)
            {
                int k = factors.get(i);
                long mi = Long.MAX_VALUE;
                long ma = Long.MIN_VALUE;
 
                for(int j=1;j<=n/k;j++)
                {
                    int endIndex = k*j-1; 
                    int startIndex = k*(j-1)-1; 

                    long segmentSum = a[endIndex] - (startIndex >= 0 ? a[startIndex] : 0); 

                    ma = Math.max(ma, segmentSum); 
                    mi = Math.min(mi, segmentSum);
                }
                
                maxi = Math.max(maxi, ma-mi);
            }
            
            System.out.println(maxi);
        }
    }
}