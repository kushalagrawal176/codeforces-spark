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
            long a[] = new long[n+1];
            
            a[0] = 0;
            for(int i=1;i<=n;i++)
                a[i] = a[i-1] + sc.nextInt();
            
            String s = sc.next();
            
            long sum = 0;
            int l = 0;
            int r = n-1;
            
            while(l < r)
            {
                while(l < r && s.charAt(l) == 'R')
                    l++;
                while(l < r && s.charAt(r) == 'L')
                    r--;
                
                if(l < r)
                    sum += a[r+1] - a[l];
                
                l++;
                r--;
            }
            
            System.out.println(sum);
        }
    }
}