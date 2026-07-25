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
            int maxi = -1;
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                maxi = Math.max(maxi, a[i]);
            }
            
            int idx = -1;
            
            for(int i=0;i<n;i++)
            {
                if(a[i] == maxi)
                {
                    if(i-1 >= 0 && a[i-1] < a[i])
                        idx = i+1;
                    if(i+1 < n && a[i+1] < a[i])
                        idx = i+1;
                }
            }
 
            System.out.println(idx);
        }
    }
}