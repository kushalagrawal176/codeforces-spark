import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        a[0] = sc.nextInt();
        for(int i=1;i<n;i++)
            a[i] = a[i-1]+sc.nextInt();
        
        int m = sc.nextInt();
        for(int i=0;i<m;i++)
        {
            int t = sc.nextInt();
            
            int low = 0;
            int high = n-1;
            
            int ans = 0;
            
            while(low <= high)
            {
                int mid = low + (high-low)/2;
                
                if(mid-1>=0 && a[mid-1] < t && a[mid] > t)
                {
                    ans = mid+1;
                    break;
                }
                if(mid+1<n && a[mid+1] > t && a[mid] < t)
                {
                    ans = mid+1+1;
                    break;
                }
                
                if(a[mid] == t)
                {
                    ans = mid+1;
                    break;
                }
                else if(a[mid] > t)
                    high = mid-1;
                else
                    low = mid+1;
            }
            
            if(t <= a[0])
                ans = 1;
            
            System.out.println(ans);
        }
    }
}