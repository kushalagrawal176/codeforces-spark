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
                a[i] = sc.nextInt() - a[i];
            
            Arrays.sort(a);
            
            int l = 0;
            int r = n-1;
            int cnt = 0;
            
            while(l < r)
            {
                if(a[l] + a[r] >= 0)
                {
                    cnt++;
                    r--;
                }
                
                l++;
            }
         
            System.out.println(cnt);
        }
    }
}