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
            int q = sc.nextInt();
            
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
                
            Arrays.sort(a);
            
            for(int i=0;i<n/2;i++)
            {
                int temp = a[i];
                a[i] = a[n-1-i];
                a[n-1-i] = temp;
            }
            
            for(int i=1;i<n;i++)
                a[i] += a[i-1];
            
            while(q-- > 0)
            {
                int val = sc.nextInt();
                
                int ans = -1;
                
                int low = 0;
                int high = n-1;
                
                while(low <= high)
                {
                    int mid = low + (high-low)/2;
                    
                    if(a[mid] >= val)
                    {
                        high = mid-1;
                        ans = mid+1;
                    }
                    else
                        low = mid+1;
                }
                
                System.out.println(ans);
            }
        }
    }
}