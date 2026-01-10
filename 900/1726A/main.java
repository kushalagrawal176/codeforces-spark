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
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            int maxi = Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++)
            {
                maxi = Math.max(maxi, a[i]-a[0]);
                maxi = Math.max(maxi, a[n-1]-a[i]);
                maxi = Math.max(maxi, a[i]-a[(i+1)%n]);
            }
            
            System.out.println(maxi);
        }
    }
}