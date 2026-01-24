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
            int a[] = new int[n];
            int b[] = new int[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            for(int i=0;i<n;i++)
                b[i] = sc.nextInt();
            
            int l = -1;
            int r = -1;
            
            int maxi = Integer.MIN_VALUE;
            int mini = Integer.MAX_VALUE;
            
            for(int i=0;i<n;i++)
            {
                if(a[i] == b[i])
                    continue;
                
                r = i;
                if(l == -1)
                    l = i;
            }
            
            while(l > 0 && b[l-1] <= b[l])
                l--;
            while(r < n-1 && b[r] <= b[r+1])
                r++;
                
            System.out.println((l+1) + " " + (r+1));
        }
    }
}